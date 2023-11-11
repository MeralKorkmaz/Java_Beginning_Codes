package day15enum_stringbuilder;

public enum FavouriteAuthor_Book {


    WILLIAM_SHAKESPEARE ("Hamlet", 1616,"England"),
    STEFAN_ZWEIG ("Chess",1942,"Austria"),
   FYODOR_DOSTOEVSKY ("Crime and Punishment", 1881,"Russia"),
    CHARLES_DICKENS ("A Tale of Two Cities", 1870,"England"),
    SABAHATTIN_ALI ("Kurk Mantolu Madonna",1948,"Turkiye"),
    HARPER_LEE     ("To Kill a Mockingbird",2016,"U.S.A"),
    MAXIM_GORKY ("Mother",1936,"Russia"),
    JOSE_MAURO_DE_VASCONCELOS ("My Sweet Orange Tree",1984,"Brazil");

    private final String MyFavouriteBookName;

    private final int YearOfDeath;

    private final String CountryOfBirth;

    FavouriteAuthor_Book(String MyFavouriteBookName, int YearOfDeath, String CountryOfBirth){
        this.CountryOfBirth = CountryOfBirth;
        this.MyFavouriteBookName = MyFavouriteBookName;
        this.YearOfDeath = YearOfDeath;
    }

    public String getMyFavouriteBookName() {return MyFavouriteBookName;}
    public int getYearOfDeath() {return YearOfDeath;}
    public String getCountryOfBirth() {//method
        return CountryOfBirth;
    }







}
