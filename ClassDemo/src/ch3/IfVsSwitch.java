package ch3;

public class IfVsSwitch {
    public static void main(String[] args) {
        int annualIncome = 130000;
        double taxPercent = 0;
        String maritalStatus = "married";
        if(maritalStatus.equals("single")) {
            if(annualIncome < 10275) {
                taxPercent = .1;
            } else if(annualIncome < 41775) {
                taxPercent = .12;
            } else if(annualIncome < 89075) {
                taxPercent = .22;
            } else if(annualIncome < 170050) {
                taxPercent = .24;
            } else if(annualIncome < 215950) {
                taxPercent = .32;
            } else if(annualIncome < 539900) {
                taxPercent = .35;
            } else {
                taxPercent = .37;
            }
        } else if(maritalStatus.equals("married")) {
            if(annualIncome < 20550) {
                taxPercent = .1;
            } else if(annualIncome < 83550) {
                taxPercent = .12;
            } else if(annualIncome < 178150) {
                taxPercent = .22;
            } else if(annualIncome < 340100) {
                taxPercent = .24;
            } else if(annualIncome < 431900) {
                taxPercent = .32;
            } else if(annualIncome < 647850) {
                taxPercent = .35;
            } else {
                taxPercent = .37;
            }
        }
        double taxOwed = annualIncome * taxPercent;
        System.out.printf("You owe $%,.2f in taxes\n", taxOwed);

        // do not use boolean statements, only variable names
        switch(maritalStatus) {
            case "single":
                if(annualIncome < 10275) {
                    taxPercent = .1;
                } else if(annualIncome < 41775) {
                    taxPercent = .12;
                } else if(annualIncome < 89075) {
                    taxPercent = .22;
                } else if(annualIncome < 170050) {
                    taxPercent = .24;
                } else if(annualIncome < 215950) {
                    taxPercent = .32;
                } else if(annualIncome < 539900) {
                    taxPercent = .35;
                } else {
                    taxPercent = .37;
                }
                break;
            case "married":
                if(annualIncome < 20550) {
                    taxPercent = .1;
                } else if(annualIncome < 83550) {
                    taxPercent = .12;
                } else if(annualIncome < 178150) {
                    taxPercent = .22;
                } else if(annualIncome < 340100) {
                    taxPercent = .24;
                } else if(annualIncome < 431900) {
                    taxPercent = .32;
                } else if(annualIncome < 647850) {
                    taxPercent = .35;
                } else {
                    taxPercent = .37;
                }
                break;
            default:
                // the else statement
        }
        taxOwed = annualIncome * taxPercent;
        System.out.printf("You owe $%,.2f in taxes\n", taxOwed);
    }
}
