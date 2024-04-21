package org.example;

public class Main {
    public static void main(String[] args) {
        //LOOK HOW CUTE HE IS
        System.out.printf("""
                ⣟⣯⣟⣯⡇⠀⣿⢩⣛⡼⣏⠀⠈⠋⠀⣈⡷⣙⢎⡳⣙⢮⣙⢮⣙⢎⡳⣙⢾⣿
                ⢿⡾⣽⡞⣷⣤⣏⡳⡜⡼⠗⠁⢀⠀⠙⢧⠳⣍⢞⡱⣭⠲⣍⠶⣩⢞⡱⡭⣾⣿
                ⠈⠻⠧⢿⣧⣿⠶⣵⢻⢞⡷⢲⡟⡶⢴⡭⢿⣜⣮⡱⢎⡳⣍⢞⡱⢮⡱⣳⣿⣽
                ⠀⣰⣶⡏⢷⣈⣿⣸⣇⣾⣸⣿⣾⣹⣆⡹⡎⡶⢇⡿⣹⢷⣾⣈⠷⣇⢷⣿⣿⣹
                ⣾⣻⣭⣿⣾⣿⣿⣟⣿⣿⡿⣽⡿⣿⢿⣿⣿⣿⣾⣶⣵⣾⠲⣭⢳⣞⣾⡿⣷⣿
                ⣿⣿⣿⣯⣷⣿⣿⠿⢝⠚⠋⠉⠉⠉⠙⠚⠛⡾⢿⣿⣻⣿⣿⣶⣏⠶⣩⠿⣿⡈
                ⣿⣟⣿⣻⣿⡏⠀⠀⠀⠳⡀⠀⠀⠀⠀⠰⠊⠀⠀⠈⠙⠳⣿⣿⣿⣿⣧⣻⣿⣿
                ⠘⢻⣿⣿⣽⡇⠈⠧⣄⠀⠀⠀⠀⠀⠀⢀⣄⡤⠴⠚⠀⠀⠀⠙⢿⣷⡿⣿⣿⣿
                ⠀⠠⢈⢛⣿⠀⠚⠉⠉⠱⣼⡷⠀⠀⠀⠀⠉⠉⠑⠶⠀⠀⠀⠀⠀⠻⣿⣿⣾⢿
                ⠀⠡⠈⠉⠹⡀⠀⠀⡄⠀⣸⡀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣯⣿⢿
                ⠀⠁⢶⣶⠀⢷⠀⠀⠉⠉⠀⠈⠉⠶⠆⠈⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣾⣿
                ⠀⠡⢸⢹⠏⡍⠓⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣺⡟⠋⠉⢹⢭⢣
                ⠀⠀⢸⣹⡏⠭⠭⠭⠙⣲⣦⣤⣤⣀⣀⣀⣀⣤⣤⣶⣞⠉⠙⠛⠷⢀⣀⠘⣎⠧
                ⢁⣈⣀⣀⢀⣀⣀⣀⣼⠟⠹⢿⣯⣟⣿⣻⡿⠿⠛⢿⣿⣦⡀⠀⠀⠀⠀⠉⠉⠘
                Welcome to Dr.Chopper's Exquisite Library!
                
                """);
        //JUST LOOK AT HIM
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Screen screen = new Screen();
        screen.storeHomeScreen();
        //COME ON YOU GOTTA ADMIT HE'S ADORABLE!!
    }
}