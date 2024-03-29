package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.country;


public class Canada extends Country {

    @Override
    public int getMinimumLegalDrinkingAge() {
        return 18;
    }

    public int getLegalDrinkingAge(String province) {

        if(liberalProvince(province)) return getMinimumLegalDrinkingAge();
        return 19;
    }

    private static boolean liberalProvince(String province) {
        return "Quebec".equalsIgnoreCase(province) ||
                "Alberta".equalsIgnoreCase(province);
    }


}
