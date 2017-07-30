package chapter5.city.entities;

import java.util.Scanner;

/**
 *
 * @author Sukhocheva Maryana
 */
public class City {
        public static Scanner scan;
        public Info info;
        public String city;
        
        public City(){
            System.out.println("Введите название города");
            String encoding = System.getProperty("console.encoding", "cp1251");
            Scanner scan = new Scanner(System.in, encoding);
            setCity(scan.next());
            info = new Info();
        }
       
        public String getCity(){
            return city;
        }
        
        public void setCity(String city){
            this.city = city; 
        }
        public class Info{
                int countProspects,countStreets,countSquares;
                
                public Info(){
                    String encoding = System.getProperty("console.encoding", "cp1251");
                    Scanner scaner = new Scanner(System.in, encoding);
                    System.out.println("Количество проспектов в городе:");
                    setCountProspects(scaner.nextInt());
                    System.out.println("Количество улиц в городе:");
                    setCountStreets(scaner.nextInt());
                    System.out.println("Количество площадей в городе:");
                    setCountSquares(scaner.nextInt());    
                }
               
                public int getCountProspects(){
                return countProspects;
                }
                
                public void setCountProspects(int Count){
                this.countProspects = Count;
                }
                
                public int getCountStreets(){
                return countStreets;
                }
                public void setCountStreets(int count){
                this.countStreets = count; 
                }
                public int getCountSquares(){
                return countSquares;
                }
                public void setCountSquares(int count){
                this.countSquares =  count;
                }
                public void print(){
                System.out.println("В городе " + getCity() + " "  + "проспектов - "+ getCountProspects() + ",  улиц - " + getCountStreets() +
                        ", площадей - " + getCountSquares() );
                }
        }
        
       

}
