package Shop;

import java.util.Scanner;

public class LegoMarket {
    public static void main(String[] args) {
        String[] LegoMenuArray = new String[]{"Lego City","Lego Friends","Lego Pirates","Lego Star Wars"};
        int[] CostArray = new int[]{1000,1500,40000,5000};
        menu();
        mainMenu(LegoMenuArray,CostArray);
    }
    public static void menu(){
        System.out.println("=================" +
                            "\n1.Show all sets" +
                            "\n2.Add set in to shop" +
                            "\n3.Buy" +
                            "\n4.Sorting");

    }
    public static void mainMenu(String[] LegoMenuArray , int[] CostArray){
        Scanner client = new Scanner(System.in);
        int menuNum = client.nextInt();
        while(menuNum!=0){
        switch (menuNum) {
            case 1:
                ShowAllSets(LegoMenuArray,CostArray);
                break;
            case 2:
                AddSet(LegoMenuArray);
                AddSetCost(CostArray);
                break;
            case 3:
                BuySet(LegoMenuArray,CostArray,client);
                break;
            }
            menu();
            menuNum = client.nextInt();
        }
    }
    private static void ShowAllSets(String[] legoMenuArray, int[] CostArray){
        System.out.println("=================");
        assert (legoMenuArray.length == CostArray.length);
        for (int i = 0; i < legoMenuArray.length; i++) {
            System.out.println(legoMenuArray[i] + " - " + CostArray[i] + "$");
        }
    }
    private static String[] AddSet(String[] legoMenuArray){
        int sizeLegoMenu = legoMenuArray.length;
        String[] resultLegoNames = new String[sizeLegoMenu + 1];
        System.out.println("Enter name of the new set");
        Scanner scanner = new Scanner(System.in);
        String nameNewSet = scanner.next();
        for (int i = 0; i < sizeLegoMenu; i++) {
            resultLegoNames[i] = legoMenuArray[i];
        }
        resultLegoNames[sizeLegoMenu] = nameNewSet;
        return resultLegoNames;
    }
    private static int[] AddSetCost(int[] costArray) {
        int sizeLegoCost = costArray.length;
        int[] resultLegoCost = new int[sizeLegoCost + 1];
        System.out.println("Enter cost of the new set");
        Scanner scanner = new Scanner(System.in);
        int costNewSet = scanner.nextInt();
        for (int j = 0; j < sizeLegoCost; j++) {
            resultLegoCost[j] = costArray[j];
        }
        resultLegoCost[sizeLegoCost] = costNewSet;
        System.out.println("Set added :D");
        return resultLegoCost;
    }
    public static void BuySet(String[] legoMenuArray, int[] costArray, Scanner client){

    }

}
