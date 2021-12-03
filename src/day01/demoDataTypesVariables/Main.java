package day01.demoDataTypesVariables;

public class Main {
    public static void main(String[] args) {
        // TODO: Complete the following variable declarations.

        int oldYear = 1950;
        int nowYear = 2016;

        float averageFamilyIncome1950 = 3_300;
        float medianHomePrice1950 = 7_354;
        float tuitionYale1950 = 600;
        float roomAndBoardYale1950 = 456;
        float otherExpensesYale1950 = 376;

        float averageFamilyIncome2015 = 51_017;
        float medianHomePrice2015 = 188_900;
        float medianHomePriceManhattan2013 = 855_000;
        float tuitionYale2015 = 45_800;
        float roomAndBoardYale2015 = 14_000;
        float otherExpensesYale2015 = 5_552;

        String intro = "To understand how purchasing power has changed in the past 65 years, it is useful to compare the family income to the cost of goods and services, such as housing and education.";


        // TODO: Find and fix a mistake in the following.

        if (intro == "A long time ago in a galaxy far, far away") {
            System.out.println("May the force be with you.");
        } else {
            System.out.println(intro);
        }

        // TODO: Use a print statment to add a newline or <br>.
        System.out.println("New Line After This:" + '\n');
        // TODO: Complete the following basic mathematical calculations.

        // Divide median home price by annual income and print each result to the command line.
        // Make 3 variables: homeRatio1950, homeRatio2015, homeRatioNYC2015
        float homeRatio1950 = (medianHomePrice1950 / averageFamilyIncome1950);
        System.out.println(homeRatio1950);

        float homeRatio2015 = (medianHomePrice2015 / averageFamilyIncome2015);
        System.out.println(homeRatio2015);

        float homeRatioNYC2015 = (medianHomePriceManhattan2013 / averageFamilyIncome1950);
        System.out.println((homeRatioNYC2015));

        // Find the total cost of university education for 1950 and for 2015 and print result to the command line.
        // Then divide university cost by annual income for both: educationRatio1950, & educationRation2015. Print the results to the command line.
        float totalUniCost1950 = (tuitionYale1950 + roomAndBoardYale1950 + otherExpensesYale1950);
        System.out.println(totalUniCost1950);
        float totalUniCost2015 = (tuitionYale2015 + roomAndBoardYale2015 + otherExpensesYale2015);
        System.out.println(totalUniCost2015);
        float educationRatio1950 = (totalUniCost1950 / averageFamilyIncome1950);
        System.out.println(educationRatio1950);
        float educationRatio2015 = (totalUniCost2015 / averageFamilyIncome2015);
        System.out.println(educationRatio2015);

        // TODO: Convert the following String into a number.
        String averageDebt1950 = "2000";
        double d = Double.parseDouble(averageDebt1950);
        System.out.println(d);

        // TODO: Complete the following variable declarations, find the typo, and replace the /*something*/'s in the String with the proper variables.
        short creditCardDebt2010 = 15_355;
        int totalDebt2010 = 129_579;
        String debt = "Debt is an unwelcome guest at the table in many American households. Back in the late 1940s and early 1950s, the average American consumer had less than $" + averageDebt1950 + " in total personal debt. Today the average U.S. household with debt carries $" + creditCardDebt2010 + " in credit card debt and $" + totalDebt2010 + " in total debt.";
        System.out.println(debt);
        // TODO: Using one line of code, determine if the following string contains the word "table". Print the result to the command line.
        boolean hasTable = debt.contains("table");
        System.out.println(hasTable);
        // TODO: How has the ratio of debt to income changed in the past 60 years?
        double debtToIncome1950 = (d / averageFamilyIncome1950);
        System.out.println(debtToIncome1950);
        float debtToIncome2015 = (totalDebt2010 / averageFamilyIncome2015);
        System.out.println(debtToIncome2015);
        // EXTRA: Round the answer to two decimal places.
        System.out.println(Math.round(debtToIncome2015));
    }
}
