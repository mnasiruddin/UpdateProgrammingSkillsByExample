package learnbyexample;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.math.BigDecimal;

public class GsonExample {

    public static void main(String[] args) {

        Properties.ZoneCharge zoneCharge = new Properties.ZoneCharge(BigDecimal.ONE, "EUR");
        Properties properties = new Properties("ABC", "DEF", zoneCharge);

        final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Properties.class, new JsonSerializer<Properties>() {
            @Override
            public JsonElement serialize(Properties property, Type typeOfSrc, JsonSerializationContext context) {
                final JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("zone_code", property.getZoneCode());
                jsonObject.addProperty("zone_name", property.getZonename().replace("'", "''"));
                if (null != properties.getZoneCharge()) {
                    JsonObject zoneCharge = new JsonObject();
                    zoneCharge.addProperty("amount", property.getZoneCharge().getAmount());
                    zoneCharge.addProperty("currency", property.getZoneCharge().getCurrency());
                    jsonObject.add("zone_charge", zoneCharge);
                }
                return jsonObject;
            }
        });
        gsonBuilder.registerTypeAdapter(Properties.class, new JsonDeserializer<Properties>() {
            @Override
            public Properties deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
                final JsonObject asJsonObject = jsonElement.getAsJsonObject();
                final String zoneCode = asJsonObject.get("zone_code").getAsString();
                final String zoneName = asJsonObject.get("zone_name").getAsString().replace("''", "'");
                Properties.ZoneCharge zoneCharge = null;
                JsonElement jsonZoneChargeElement = asJsonObject.get("zone_charge");
                if (jsonZoneChargeElement != null) {
                    BigDecimal amount = jsonZoneChargeElement.getAsJsonObject().get("amount").getAsBigDecimal();
                    String currency = jsonZoneChargeElement.getAsJsonObject().get("currency").getAsString();
                    zoneCharge = new Properties.ZoneCharge(amount, currency);
                }
                return new Properties(zoneCode, zoneName, zoneCharge);
            }
        });

        System.out.println("to gsonBuilder : " + gsonBuilder.create().toJson(properties));
        Properties properties1 = gsonBuilder.create().fromJson(gsonBuilder.create().toJson(properties), Properties.class);
        System.out.println("getZoneCode : " + properties1.getZoneCode());
        System.out.println("getZonename : " + properties1.getZonename());
        System.out.println("getAmount : " + properties1.getZoneCharge().getAmount());
        System.out.println("getCurrency : " + properties1.getZoneCharge().getCurrency());
    }
}
