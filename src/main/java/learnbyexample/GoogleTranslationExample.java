package learnbyexample;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class GoogleTranslationExample {

    static String textToTranslate = "mohammed nasiruddin";//"陽太郎 土屋";

    public static void main(String[] args) {

        try {
            Translator translator = new Translator();
            long timeMillis = System.currentTimeMillis();
            String translatedResult = translator.sendRequest("EN", textToTranslate);
            timeMillis = System.currentTimeMillis() - timeMillis;
            System.out.println(translatedResult);
            System.out.println(timeMillis);
            System.out.println(TimeUnit.MILLISECONDS.toSeconds(timeMillis));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Translator {

        private final static String translationUrl = "https://translation.googleapis.com/language/translate/v2?key=";
        private final static String langUrl = "https://translation.googleapis.com/language/translate/v2/languages?key=";
        private final static String key = "AIzaSyAMh6Jz1fjaCyNbW4T8ftpXcdVPI7gc03I";

        public String translate(String lang, String textToTranslate) throws Exception {
            return sendRequest(lang, textToTranslate);
        }

        private String sendRequest(String lang, String textToTranslate) throws MalformedURLException, IOException {
            // Instantiates a client
            Translate translate = TranslateOptions.newBuilder().setApiKey(key).build().getService();

            // Translates some text into Russian
            Translation translation = translate.translate(textToTranslate, Translate.TranslateOption.targetLanguage(lang));

            return translation.getTranslatedText();
        }
    }

}
