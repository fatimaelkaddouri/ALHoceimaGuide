package com.tutomobile.android.sqlite;

/**
 * Création d'un livre tout simple pour un exemple d'utilisation de SQLite sous Android
 * @author Axon
 * http://www.tutomobile.fr
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class SqliteDataBase extends SQLiteOpenHelper {

    private static final String TABLE_Endroit = "Endroit";
    private static final String COL_ID = "NomEndroit";
    private static final String COL_ISBN = "descriptin";

    private static final String TABLE_touriste = "Touriste";
    private static final String COL_key = "EmailTouriste";
    private static final String COL_motpasse = "Motpasse";

    private static final String TABLE_Favoris = "Favoris";
    private static final String COL_idfav = "IdFavoris";
    private static final String COL_Date = "Date_Ajou";
    private static final String COL_NOME = "NomEndroit";

    private static final String TABLE_plage = "Plage";
    private static final String COL_idPlage = "NomPlage";
    private static final String COL_desc = "Description";
    private static final String COL_ima = "ImageView";

    private static final String TABLE_REs = "Restaurant";
    private static final String COL_idRest = "NomRestaurant";
    private static final String COL_DAdress = "AdresseRestaurant";
    private static final String COL_tel = "tel";



    private static final String TABLE_hotel = "Hotel";
    private static final String COL_idhotel = "NomHotel";
    private static final String COL_Adress = "AdresseHotel";
    private static final String COL_tele = "tel";
    private static final String COL_image = "ImageView";

    private static final String TABLE_transport = "transport";
    private static final String COL_idtransp = "Type";
    private static final String COL_Adresse = "AdresseTransport";
    private static final String COL_telephone = "tel";
    private static final String COL_imageg = "ImageView";

    private static final String TABLE_Activity = "Activité";
    private static final String COL_idactiv = "NomAct";
    private static final String COL_descr = "DescriptionAct";
    private static final String COL_imageac = "ImageView";

    private static final String CREATE_BDD = "CREATE TABLE " + TABLE_Endroit + " ("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_ISBN + " TEXT NOT NULL);";

    private static final String CREATE_BDD1 = "CREATE TABLE " + TABLE_touriste + " ("
            + COL_key + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_motpasse + " TEXT NOT NULL);";

    private static final String CREATE_BDD2 = "CREATE TABLE " + TABLE_Favoris + " ("
            + COL_idfav + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_Date + " TEXT NOT NULL);";

    private static final String CREATE_BDD3 = "CREATE TABLE " + TABLE_plage + " ("
            + COL_idPlage + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_desc + " TEXT NOT NULL);";

    private static final String CREATE_BDD4 = "CREATE TABLE " + TABLE_REs + " ("
            + COL_idRest + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_DAdress + " TEXT NOT NULL);";

    private static final String CREATE_BDD5 = "CREATE TABLE " + TABLE_hotel + " ("
            + COL_idhotel + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_Adress + " TEXT NOT NULL);";

    private static final String CREATE_BDD6 = "CREATE TABLE " + TABLE_transport + " ("
            + COL_idtransp + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_Adresse + " TEXT NOT NULL);";

    private static final String CREATE_BDD7 = "CREATE TABLE " + TABLE_Activity + " ("
            + COL_idactiv + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_desc + " TEXT NOT NULL);";

    public SqliteDataBase(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //on crée la table à partir de la requête écrite dans la variable CREATE_BDD
        db.execSQL(CREATE_BDD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //On peut faire ce qu'on veut ici moi j'ai décidé de supprimer la table et de la recréer
        //comme ça lorsque je change la version les id repartent de 0
        db.execSQL("DROP TABLE " + TABLE_touriste + ";");
        onCreate(db);
    }

}
class Endroit {

    private String NomEndroit;
    private String description;
    private String titre;

    public Endroit(){}

    public Endroit(String description, String titre){
        this.description = description;
        this.titre = titre;
    }

    public String getId() {
        return NomEndroit;
    }

    public void setId(String id) {
        this.NomEndroit =NomEndroit;
    }

    public String getIsbn() {
        return description;
    }

    public void setIsbn(String isbn) {
        this.description = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String toString(){
        return "ID : "+NomEndroit+"\nISBN : "+description+"\nTitre : "+titre;
    }




    class Touriste {

        private String EmailTouriste;
        private double MotPasse;


        public Touriste(String EmailTouriste, double MotPass){
            this.EmailTouriste =EmailTouriste;

        }

        public String getId() {
            return EmailTouriste;
        }

        public void setId(String id) {
            this.EmailTouriste =NomEndroit;
        }

        public double getIsbn() {
            return MotPasse;
        }

        public void setIsbn(double motPasse) {
            this.MotPasse = MotPasse;
        }

        public String toString(){
            return "ID : "+EmailTouriste+"\nISBN : "+MotPasse+"\nTitre : "+titre;
        }
    }




            class Plage {

            private String NomPlage;
            private String Description;
            private String ImageView;

                public Plage(){}

            public Plage( String NomPlage, String Description, String ImageView){
                this.NomPlage = NomPlage;
                this.ImageView = ImageView;
                this.Description = Description;
            }

            public String getId() {
                return NomPlage;
            }

            public void setId(String id) {
                this.NomPlage =NomPlage;
            }

            public String getIsbn() {
                return description;
            }


            public String toString(){
                return "ID : "+NomEndroit+"\nISBN : "+description+"\nTitre : "+titre;
            }
            }



    class Restaurant {

        private String NomRestaurant;
        private String AdresseRestaurant;
        private int tel;



        public Restaurant(String NomRestaurant, String AdresseRestaurant, int tel){
            this.AdresseRestaurant = AdresseRestaurant;
            this.NomRestaurant = NomRestaurant;
            this.tel = tel;
        }

        public String getId() {
            return NomRestaurant;
        }

        public void setId(String id) {
            this.NomRestaurant =NomRestaurant;
        }

        public String getIsbn() {
            return AdresseRestaurant;
        }

        public void setIsbn(String AdressRestaurant) {
            this.AdresseRestaurant = AdressRestaurant;
        }

        public int getTitre() {
            return tel;
        }

        public void setTitre(int tel) {
            this.tel = tel;
        }

        public String toString(){
            return "ID : "+NomEndroit+"\nISBN : "+description+"\nTitre : "+titre;
        }
}
}
