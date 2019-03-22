package learnbyexample.java8;

import com.google.common.collect.ImmutableSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MapObjectToMapString {

    public static void main(String[] args) {
        final Set<String> AU_STATE_CODES = new HashSet<>();
        AU_STATE_CODES.add("NSW");
        AU_STATE_CODES.add("QLD");
        AU_STATE_CODES.add("SA");
        AU_STATE_CODES.add("TAS");
        AU_STATE_CODES.add("VIC");
        AU_STATE_CODES.add("WA");
        AU_STATE_CODES.add("ACT");
        AU_STATE_CODES.add("NT");

        final Set<PaymentCardType> paymentCardTypeSet = new HashSet<>();
        paymentCardTypeSet.add(new PaymentCardType("abc", "desciprtion1"));
        paymentCardTypeSet.add(new PaymentCardType("def", "desciprtion2"));
        paymentCardTypeSet.add(new PaymentCardType("ghi", "desciprtion3"));
        paymentCardTypeSet.add(new PaymentCardType("jkl", "desciprtion4"));

        final Set<PaymentCardType> finalSet = new HashSet<>(paymentCardTypeSet);

        AU_STATE_CODES.forEach(s -> {
            final Set<PaymentCardType> copy = new HashSet<>(finalSet);
            if (s.equalsIgnoreCase("NSW")) {
                final Set<PaymentCardType> copy1 = new HashSet<>(copy);
                final Set<PaymentCardType> added = new HashSet<>();
                Iterator<PaymentCardType> iterator = copy1.iterator();
                while (iterator.hasNext()) {
                    PaymentCardType next = iterator.next();
                    if (next.getCodeValue().equalsIgnoreCase("abc")) {
                        PaymentCardType paymentCardType = new PaymentCardType(next.getCodeValue(), next.getDescription());
                        paymentCardType.setSelected(true);
                        added.add(paymentCardType);
                        iterator.remove();
                    }
                }
                copy1.addAll(added);

                System.out.println("copy1 +++++++++++----------------");
                copy1.forEach(paymentCardType -> {
                    System.out.println(paymentCardType.isSelected());
                });

                System.out.println("finalSet +++++++++++----------------");
                finalSet.forEach(paymentCardType -> {
                    System.out.println(paymentCardType.isSelected());
                });
            }
            System.out.println("+++++++++++----------------");
            copy.forEach(paymentCardType -> {
                System.out.println(paymentCardType.isSelected());
            });
            System.out.println("????????????+++++++++++----------------");
            finalSet.forEach(paymentCardType -> {
                System.out.println(paymentCardType.isSelected());
            });
        });

        System.out.println("----------------");
        finalSet.forEach(paymentCardType -> {
            System.out.println(paymentCardType.isSelected());
        });
    }

    private static Set<String> getSet() {
        final Set<String> paymentCardTypeSet = new HashSet<>();
        paymentCardTypeSet.add("abc");
        paymentCardTypeSet.add("def");
        paymentCardTypeSet.add("ghi");
        paymentCardTypeSet.add("jkl");
        return paymentCardTypeSet;
    }
}
