public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();

        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = 2;

        Movie two = new Movie();

        two.title = "Lost in Cublicle Space";
        two.genre = "Comedy";
        two.rating = 5;

        Movie three = new Movie();

        three.title = "Byte Club";
        three.genre = "Tragic but ultimtely uplifting";
        three.rating = 127;

        System.out.println(one.title);

    }
}
