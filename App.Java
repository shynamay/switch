public class App {
    public static void main(String[] args) throws Exception {

        String today = "wednesday";

        switch (today) {
            case "monday":
                System.out.println(" attend my first class ");
                break;
            case "tuesday":
                System.out.println(" Walk everynight ");
                break;
            case "wednesday":
                System.out.println(" I always read novel, Manga and Manhwa ");
                break;
            case "thursday":
                System.out.println(" Cleaning our house ");
                break;
            case "friday":
                System.out.println(" Visit my relative ");
                break;
            case "Saturday":
                System.out.println(" Watching anime ");
                break;
            case "Sunday":
                System.out.println(" I go to church every sunday ");
                break;
            default: System.out.println(" Incorrect day ");
                break;
        }

    }
}
