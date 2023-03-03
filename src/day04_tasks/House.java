package day04_tasks;

public class House {
    public static void main(String[] args) {
        int bedrooms =2;
        int bathrooms =3;
        int kitchens =1;
        boolean basement =true;
        boolean attic = false;
        boolean pool = true;
        boolean sale =false;
        long costOfTheHouse= 1_000_000_000L;
        String address ="123 Palatine Irvine";
        int zipCode = 92612;
        boolean parkNearBy= true;
        int ratingSchool =4;

        String message ="The number of bedrooms:\t\t"+bedrooms+"\nThe number of bathrooms:\t"+bathrooms+"\nIs there a basement?\t\t"+basement+"\nIs there an attic?:\t\t\t"+attic+"\nIs there a pool?:\t\t\t"+pool+ "\nIs the house for sale?\t\t" + sale +"\nCost of the house:\t\t\t"+costOfTheHouse+"\nAdress:\t\t\t\t\t\t"+address+"\nZipcode:\t\t\t\t\t"+zipCode+"\nIs a park near by:\t\t\t"+parkNearBy+"\nRating of surrounding school districts:"+ratingSchool;
        System.out.println(message);







    }
}
