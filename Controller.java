package sample;
import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.*;

public class Controller implements Initializable {

    public ArrayList<TextField> condition = new ArrayList<>();
    int choice=0 ;
    boolean xoro ;
    public int xWins=0;
    public int oWins=0;
    public int draw=0 ;
    public int count = 0;
    public boolean gameCheckResult=true;
    public boolean allCasesCheck = true;
    public String s = ""  ;
    public TextField x,o,d;
    public TextField zero,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen;
    public TextField ozero,oone,otwo,othree,ofour,ofive,osix,oseven,oeight,onine,oten,oeleven,otwelve,othirteen,ofourteen;
    public TextField tzero,tone,ttwo,tthree,tfour,tfive,tsix,tseven,teight,tnine,tten,televen,ttwelve,tthirteen,tfourteen;
    public TextField thzero,thone,thtwo,ththree,thfour,thfive,thsix,thseven,theight,thnine,thten,theleven,thtwelve,ththirteen,thfourteen;
    public TextField fzero,fone,ftwo,fthree,ffour,ffive,fsix,fseven,feight,fnine,ften,feleven,ftwelve,fthirteen,ffourteen;
    public TextField fizero,fione,fitwo,fithree,fifour,fifive,fisix,fiseven,fieight,finine,fiten,fieleven,fitwelve,fithirteen,fifourteen;
    public TextField szero,sone,stwo,sthree,sfour,sfive,ssix,sseven,seight,snine,sten,seleven,stwelve,sthirteen,sfourteen;
    public TextField sezero,seone,setwo,sethree,sefour,sefive,sesix,seseven,seeight,senine,seten,seeleven,setwelve,sethirteen,sefourteen;
    public TextField ezero,eone,etwo,ethree,efour,efive,esix,eseven,eeight,enine,eten,eeleven,etwelve,ethirteen,efourteen;
    public TextField nzero,none,ntwo,nthree,nfour,nfive,nsix,nseven,neight,nnine,nten,neleven,ntwelve,nthirteen,nfourteen;
    public TextField tezero,teone,tetwo,tethree,tefour,tefive,tesix,teseven,teeight,tenine,teten,teeleven,tetwelve,tethirteen,tefourteen;
    public TextField elzero,elone,eltwo,elthree,elfour,elfive,elsix,elseven,eleight,elnine,elten,eleleven,eltwelve,elthirteen,elfourteen;
    public TextField twzero,twone,twtwo,twthree,twfour,twfive,twsix,twseven,tweight,twnine,twten,tweleven,twtwelve,twthirteen,twfourteen;
    public TextField thizero,thione,thitwo,thithree,thifour,thifive,thisix,thiseven,thieight,thinine,thiten,thieleven,thitwelve,thithirteen,thifourteen;
    public TextField fozero,foone,fotwo,fothree,fofour,fofive,fosix,foseven,foeight,fonine,foten,foeleven,fotwelve,fothirteen,fofourteen;

    ArrayList<ArrayList<TextField>> allRows     = new ArrayList<>();
    ArrayList<TextField> rowOne      = new ArrayList<TextField>();
    ArrayList<TextField> rowTwo      = new ArrayList<TextField>();
    ArrayList<TextField> rowThree    = new ArrayList<TextField>();
    ArrayList<TextField> rowFour     = new ArrayList<TextField>();
    ArrayList<TextField> rowFive     = new ArrayList<TextField>();
    ArrayList<TextField> rowSix      = new ArrayList<TextField>();
    ArrayList<TextField> rowSeven    = new ArrayList<TextField>();
    ArrayList<TextField> rowEight    = new ArrayList<TextField>();
    ArrayList<TextField> rowNine     = new ArrayList<TextField>();
    ArrayList<TextField> rowTen      = new ArrayList<TextField>();
    ArrayList<TextField> rowEleven   = new ArrayList<TextField>();
    ArrayList<TextField> rowTwelve   = new ArrayList<TextField>();
    ArrayList<TextField> rowThirteen = new ArrayList<TextField>();
    ArrayList<TextField> rowFourteen = new ArrayList<TextField>();
    ArrayList<TextField> rowFiftteen = new ArrayList<TextField>();

    ArrayList<ArrayList<TextField>> allCols     = new ArrayList<>();
    ArrayList<TextField> colOne      = new ArrayList<TextField>();
    ArrayList<TextField> colTwo      = new ArrayList<TextField>();
    ArrayList<TextField> colThree    = new ArrayList<TextField>();
    ArrayList<TextField> colFour     = new ArrayList<TextField>();
    ArrayList<TextField> colFive     = new ArrayList<TextField>();
    ArrayList<TextField> colSix      = new ArrayList<TextField>();
    ArrayList<TextField> colSeven    = new ArrayList<TextField>();
    ArrayList<TextField> colEight    = new ArrayList<TextField>();
    ArrayList<TextField> colNine     = new ArrayList<TextField>();
    ArrayList<TextField> colTen      = new ArrayList<TextField>();
    ArrayList<TextField> colEleven   = new ArrayList<TextField>();
    ArrayList<TextField> colTwelve   = new ArrayList<TextField>();
    ArrayList<TextField> colThirteen = new ArrayList<TextField>();
    ArrayList<TextField> colFourteen = new ArrayList<TextField>();
    ArrayList<TextField> colFiftteen = new ArrayList<TextField>();

    ArrayList<ArrayList<TextField>> diagonalOne     = new ArrayList<>();
    ArrayList<TextField> dozero = new ArrayList<TextField>();
    ArrayList<TextField> doone  = new ArrayList<TextField>();
    ArrayList<TextField> dotwo= new ArrayList<TextField>();
    ArrayList<TextField> dothree = new ArrayList<TextField>();
    ArrayList<TextField> dofour = new ArrayList<TextField>();
    ArrayList<TextField> dofive = new ArrayList<TextField>();
    ArrayList<TextField> dosix  = new ArrayList<TextField>();
    ArrayList<TextField> doseven = new ArrayList<TextField>();
    ArrayList<TextField> doeight = new ArrayList<TextField>();
    ArrayList<TextField> donine = new ArrayList<TextField>();
    ArrayList<TextField> doten  = new ArrayList<TextField>();
    ArrayList<TextField> doeleven = new ArrayList<TextField>();
    ArrayList<TextField> dotwelve = new ArrayList<TextField>();
    ArrayList<TextField> dothirteen = new ArrayList<TextField>();
    ArrayList<TextField> dofourteen = new ArrayList<TextField>();
    ArrayList<TextField> dofifteen = new ArrayList<TextField>();
    ArrayList<TextField> dosixteen = new ArrayList<TextField>();
    ArrayList<TextField> doseventeen = new ArrayList<TextField>();
    ArrayList<TextField> doeightteen = new ArrayList<TextField>();
    ArrayList<TextField> donineteen = new ArrayList<TextField>();
    ArrayList<TextField> dotwenty = new ArrayList<TextField>();

    ArrayList<ArrayList<TextField>> diagonalTwo     = new ArrayList<>();
    ArrayList<TextField> dtzero = new ArrayList<TextField>();
    ArrayList<TextField> dtone  = new ArrayList<TextField>();
    ArrayList<TextField> dttwo= new ArrayList<TextField>();
    ArrayList<TextField> dtthree = new ArrayList<TextField>();
    ArrayList<TextField> dtfour = new ArrayList<TextField>();
    ArrayList<TextField> dtfive = new ArrayList<TextField>();
    ArrayList<TextField> dtsix  = new ArrayList<TextField>();
    ArrayList<TextField> dtseven = new ArrayList<TextField>();
    ArrayList<TextField> dteight = new ArrayList<TextField>();
    ArrayList<TextField> dtnine = new ArrayList<TextField>();
    ArrayList<TextField> dtten  = new ArrayList<TextField>();
    ArrayList<TextField> dteleven = new ArrayList<TextField>();
    ArrayList<TextField> dttwelve = new ArrayList<TextField>();
    ArrayList<TextField> dtthirteen = new ArrayList<TextField>();
    ArrayList<TextField> dtfourteen = new ArrayList<TextField>();
    ArrayList<TextField> dtfifteen = new ArrayList<TextField>();
    ArrayList<TextField> dtsixteen = new ArrayList<TextField>();
    ArrayList<TextField> dtseventeen = new ArrayList<TextField>();
    ArrayList<TextField> dteightteen = new ArrayList<TextField>();
    ArrayList<TextField> dtnineteen = new ArrayList<TextField>();
    ArrayList<TextField> dttwenty = new ArrayList<TextField>();


    public void zero()         { setXorO(zero); }
    public void one()          { setXorO(one);}
    public void two()          { setXorO(two);}
    public void three()        { setXorO(three);}
    public void four()         { setXorO(four);}
    public void five()         { setXorO(five);}
    public void six()          { setXorO(six);}
    public void seven()        { setXorO(seven);}
    public void eight()        { setXorO(eight);}
    public void nine()         { setXorO(nine);}
    public void ten()          { setXorO(ten);}
    public void eleven()       { setXorO(eleven);}
    public void twelve()       { setXorO(twelve);}
    public void thirteen()     { setXorO(thirteen);}
    public void fourteen()     { setXorO(fourteen);}
    public void ozero()        { setXorO(ozero);}
    public void oone()         { setXorO(oone);}
    public void otwo()         { setXorO(otwo);}
    public void othree()       { setXorO(othree);}
    public void ofour()        { setXorO(ofour);}
    public void ofive()        { setXorO(ofive);}
    public void osix()         { setXorO(osix);}
    public void oseven()       { setXorO(oseven);}
    public void oeight()       { setXorO(oeight);}
    public void onine()        { setXorO(onine);}
    public void oten()         { setXorO(oten);}
    public void oeleven()      { setXorO(oeleven);}
    public void otwelve()      { setXorO(otwelve);}
    public void othirteen()    { setXorO(othirteen); }
    public void ofourteen()    { setXorO(ofourteen); }
    public void tzero()        { setXorO(tzero);}
    public void tone()         { setXorO(tone);}
    public void ttwo()         { setXorO(ttwo);}
    public void tthree()       { setXorO(tthree);}
    public void tfour()        { setXorO(tfour);}
    public void tfive()        { setXorO(tfive);}
    public void tsix()         { setXorO(tsix);}
    public void tseven()       { setXorO(tseven);}
    public void teight()       { setXorO(teight);}
    public void tnine()        { setXorO(tnine);}
    public void tten()         { setXorO(tten);}
    public void televen()      { setXorO(televen);}
    public void ttwelve()      { setXorO(ttwelve);}
    public void tthirteen()    { setXorO(tthirteen); }
    public void tfourteen()    { setXorO(tfourteen); }
    public void thzero()       { setXorO(thzero);}
    public void thone()        { setXorO(thone);}
    public void thtwo()        { setXorO(thtwo);}
    public void ththree()      { setXorO(ththree);}
    public void thfour()       { setXorO(thfour);}
    public void thfive()       { setXorO(thfive);}
    public void thsix()        { setXorO(thsix);}
    public void thseven()      { setXorO(thseven);}
    public void theight()      { setXorO(theight);}
    public void thnine()       { setXorO(thnine);}
    public void thten()        { setXorO(thten);}
    public void theleven()     { setXorO(theleven);}
    public void thtwelve()     { setXorO(thtwelve);}
    public void ththirteen()   { setXorO(ththirteen); }
    public void thfourteen()   { setXorO(thfourteen); }
    public void fzero()        { setXorO(fzero);}
    public void fone()         { setXorO(fone);}
    public void ftwo()         { setXorO(ftwo);}
    public void fthree()       { setXorO(fthree);}
    public void ffour()        { setXorO(ffour);}
    public void ffive()        { setXorO(ffive);}
    public void fsix()         { setXorO(fsix);}
    public void fseven()       { setXorO(fseven);}
    public void feight()       { setXorO(feight);}
    public void fnine()        { setXorO(fnine);}
    public void ften()         { setXorO(ften);}
    public void feleven()      { setXorO(feleven);}
    public void ftwelve()      { setXorO(ftwelve);}
    public void fthirteen()    { setXorO(fthirteen); }
    public void ffourteen()    { setXorO(ffourteen); }
    public void fizero()       { setXorO(fizero);}
    public void fione()        { setXorO(fione);}
    public void fitwo()        { setXorO(fitwo);}
    public void fithree()      { setXorO(fithree);}
    public void fifour()       { setXorO(fifour);}
    public void fifive()       { setXorO(fifive);}
    public void fisix()        { setXorO(fisix);}
    public void fiseven()      { setXorO(fiseven);}
    public void fieight()      { setXorO(fieight);}
    public void finine()       { setXorO(finine);}
    public void fiten()        { setXorO(fiten);}
    public void fieleven()     { setXorO(fieleven);}
    public void fitwelve()     { setXorO(fitwelve);}
    public void fithirteen()   { setXorO(fithirteen); }
    public void fifourteen()   { setXorO(fifourteen); }
    public void szero()        { setXorO(szero);}
    public void sone()         { setXorO(sone);}
    public void stwo()         { setXorO(stwo);}
    public void sthree()       { setXorO(sthree);}
    public void sfour()        { setXorO(sfour);}
    public void sfive()        { setXorO(sfive);}
    public void ssix()         { setXorO(ssix);}
    public void sseven()       { setXorO(sseven);}
    public void seight()       { setXorO(seight);}
    public void snine()        { setXorO(snine);}
    public void sten()         { setXorO(sten);}
    public void seleven()      { setXorO(seleven);}
    public void stwelve()      { setXorO(stwelve);}
    public void sthirteen()    { setXorO(sthirteen); }
    public void sfourteen()    { setXorO(sfourteen); }
    public void sezero()       { setXorO(sezero);}
    public void seone()        { setXorO(seone);}
    public void setwo()        { setXorO(setwo);}
    public void sethree()      { setXorO(sethree);}
    public void sefour()       { setXorO(sefour);}
    public void sefive()       { setXorO(sefive);}
    public void sesix()        { setXorO(sesix);}
    public void seseven()      { setXorO(seseven);}
    public void seeight()      { setXorO(seeight);}
    public void senine()       { setXorO(senine);}
    public void seten()        { setXorO(seten);}
    public void seeleven()     { setXorO(seeleven);}
    public void setwelve()     { setXorO(setwelve);}
    public void sethirteen()   { setXorO(sethirteen); }
    public void sefourteen()   { setXorO(sefourteen); }
    public void ezero()        { setXorO(ezero);}
    public void eone()         { setXorO(eone);}
    public void etwo()         { setXorO(etwo);}
    public void ethree()       { setXorO(ethree);}
    public void efour()        { setXorO(efour);}
    public void efive()        { setXorO(efive);}
    public void esix()         { setXorO(esix);}
    public void eseven()       { setXorO(eseven);}
    public void eeight()       { setXorO(eeight);}
    public void enine()        { setXorO(enine);}
    public void eten()         { setXorO(eten);}
    public void eeleven()      { setXorO(eeleven);}
    public void etwelve()      { setXorO(etwelve);}
    public void ethirteen()    { setXorO(ethirteen); }
    public void efourteen()    { setXorO(efourteen); }
    public void nzero()        { setXorO(nzero);}
    public void none()         { setXorO(none);}
    public void ntwo()         { setXorO(ntwo);}
    public void nthree()       { setXorO(nthree);}
    public void nfour()        { setXorO(nfour);}
    public void nfive()        { setXorO(nfive);}
    public void nsix()         { setXorO(nsix);}
    public void nseven()       { setXorO(nseven);}
    public void neight()       { setXorO(neight);}
    public void nnine()        { setXorO(nnine);}
    public void nten()         { setXorO(nten);}
    public void neleven()      { setXorO(neleven);}
    public void ntwelve()      { setXorO(ntwelve);}
    public void nthirteen()    { setXorO(nthirteen); }
    public void nfourteen()    { setXorO(nfourteen); }
    public void tezero()       { setXorO(tezero);}
    public void teone()        { setXorO(teone);}
    public void tetwo()        { setXorO(tetwo);}
    public void tethree()      { setXorO(tethree);}
    public void tefour()       { setXorO(tefour);}
    public void tefive()       { setXorO(tefive);}
    public void tesix()        { setXorO(tesix);}
    public void teseven()      { setXorO(teseven);}
    public void teeight()      { setXorO(teeight);}
    public void tenine()       { setXorO(tenine);}
    public void teten()        { setXorO(teten);}
    public void teeleven()     { setXorO(teeleven);}
    public void tetwelve()     { setXorO(tetwelve);}
    public void tethirteen()   { setXorO(tethirteen); }
    public void tefourteen()   { setXorO(tefourteen); }
    public void elzero()       { setXorO(elzero);}
    public void elone()        { setXorO(elone);}
    public void eltwo()        { setXorO(eltwo);}
    public void elthree()      { setXorO(elthree);}
    public void elfour()       { setXorO(elfour);}
    public void elfive()       { setXorO(elfive);}
    public void elsix()        { setXorO(elsix);}
    public void elseven()      { setXorO(elseven);}
    public void eleight()      { setXorO(eleight);}
    public void elnine()       { setXorO(elnine);}
    public void elten()        { setXorO(elten);}
    public void eleleven()     { setXorO(eleleven);}
    public void eltwelve()     { setXorO(eltwelve);}
    public void elthirteen()   { setXorO(elthirteen); }
    public void elfourteen()   { setXorO(elfourteen); }
    public void twzero()       { setXorO(twzero);}
    public void twone()        { setXorO(twone);}
    public void twtwo()        { setXorO(twtwo);}
    public void twthree()      { setXorO(twthree);}
    public void twfour()       { setXorO(twfour);}
    public void twfive()       { setXorO(twfive);}
    public void twsix()        { setXorO(twsix);}
    public void twseven()      { setXorO(twseven);}
    public void tweight()      { setXorO(tweight);}
    public void twnine()       { setXorO(twnine);}
    public void twten()        { setXorO(twten);}
    public void tweleven()     { setXorO(tweleven);}
    public void twtwelve()     { setXorO(twtwelve);}
    public void twthirteen()   { setXorO(twthirteen); }
    public void twfourteen()   { setXorO(twfourteen); }
    public void thizero()      { setXorO(thizero);}
    public void thione()       { setXorO(thione);}
    public void thitwo()       { setXorO(thitwo);}
    public void thithree()     { setXorO(thithree);}
    public void thifour()      { setXorO(thifour);}
    public void thifive()      { setXorO(thifive);}
    public void thisix()       { setXorO(thisix);}
    public void thiseven()     { setXorO(thiseven);}
    public void thieight()     { setXorO(thieight);}
    public void thinine()      { setXorO(thinine);}
    public void thiten()       { setXorO(thiten);}
    public void thieleven()    { setXorO(thieleven);}
    public void thitwelve()    { setXorO(thitwelve);}
    public void thithirteen()  { setXorO(thithirteen); }
    public void thifourteen()  { setXorO(thifourteen); }
    public void fozero()       { setXorO(fozero);}
    public void foone()        { setXorO(foone);}
    public void fotwo()        { setXorO(fotwo);}
    public void fothree()      { setXorO(fothree);}
    public void fofour()       { setXorO(fofour);}
    public void fofive()       { setXorO(fofive);}
    public void fosix()        { setXorO(fosix);}
    public void foseven()      { setXorO(foseven);}
    public void foeight()      { setXorO(foeight);}
    public void fonine()       { setXorO(fonine);}
    public void foten()        { setXorO(foten);}
    public void foeleven()     { setXorO(foeleven);}
    public void fotwelve()     { setXorO(fotwelve);}
    public void fothirteen()   { setXorO(fothirteen); }
    public void fofourteen( )  { setXorO(fofourteen); }

    public void setXorO(TextField x){

        count++;
        if(!condition.contains(x) && gameCheckResult){
                  xoro = choice%2==0;
                  x.setText(xoro ? "X" : "O");
                  choice++;
                  condition.add(x);

            if(choice>=9){
                allConditionsCheck();
            }
        }


    }

    public void allConditionsCheck(){

        s = "";

        check(allRows);
        check(allCols);
        check(diagonalOne);
        check(diagonalTwo);

        if(count == 225 && !gameCheckResult){
                draw++;
                d.setText("Draws : "+draw);
                clear();

        }

    }
    public void check(ArrayList<ArrayList<TextField>> cases){

        for(int i=0;i<cases.size();i++) {

            for (TextField x : cases.get(i)) {
                s = s + x.getText();
            }
            if(s.contains("XXXXX")){
                xWins++;
                x.setText("X wins : "+xWins);
                s ="";
                gameCheckResult = false;
                clear();
                break;
            }
            else if(s.contains("OOOOO")){
                oWins++;
                o.setText("O wins : "+oWins);
                s ="";
                gameCheckResult = false;
                clear();
                break;
            }
            s = "";

        }
    }

    public void readData() throws FileNotFoundException {

        String filePath = "records.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath ));
            String line = br.readLine();

            xWins = Integer.parseInt(String.valueOf(line.charAt(0)));
            oWins = Integer.parseInt(String.valueOf(line.charAt(2)));
            draw = Integer.parseInt(String.valueOf(line.charAt(4)));

        } catch (Exception ignored) {
        }

        try {
            x.setText("X win  : " + xWins);
            o.setText("O wins : " + oWins);
            d.setText("Draws  : " + draw);
        }catch (Exception ignored){}

    }

    /**
     * In saveData method it will get the count of number of X wins , O wins and draw .
     * Than it will store data in records.txt file .
     */

    private void saveData() {

        String filePath = "records.txt";
        try {
            FileWriter fw = new FileWriter(filePath);

            fw.write(xWins+","+oWins+","+draw+ "\nX,O,Draws");
            fw.close();
        } catch (Exception ignored) {

        }

    }

    /**
     * In quit method it will close the scene.
     */
    public void quit() {

        Platform.exit();
        saveData();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            readData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        Collections.addAll(rowOne,     zero,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen);
        Collections.addAll(rowTwo,     ozero,oone,otwo,othree,ofour,ofive,osix,oseven,oeight,onine,oten,oeleven,otwelve,othirteen,ofourteen);
        Collections.addAll(rowThree,   tzero,tone,ttwo,tthree,tfour,tfive,tsix,tseven,teight,tnine,tten,televen,ttwelve,tthirteen,tfourteen);
        Collections.addAll(rowFour,    thzero,thone,thtwo,ththree,thfour,thfive,thsix,thseven,theight,thnine,thten,theleven,thtwelve,ththirteen,thfourteen);
        Collections.addAll(rowFive,    fzero,fone,ftwo,fthree,ffour,ffive,fsix,fseven,feight,fnine,ften,feleven,ftwelve,fthirteen,ffourteen);
        Collections.addAll(rowSix,     fizero,fione,fitwo,fithree,fifour,fifive,fisix,fiseven,fieight,finine,fiten,fieleven,fitwelve,fithirteen,fifourteen);
        Collections.addAll(rowSeven,   szero,sone,stwo,sthree,sfour,sfive,ssix,sseven,seight,snine,sten,seleven,stwelve,sthirteen,sfourteen);
        Collections.addAll(rowEight,   sezero,seone,setwo,sethree,sefour,sefive,sesix,seseven,seeight,senine,seten,seeleven,setwelve,sethirteen,sefourteen);
        Collections.addAll(rowNine,    ezero,eone,etwo,ethree,efour,efive,esix,eseven,eeight,enine,eten,eeleven,etwelve,ethirteen,efourteen);
        Collections.addAll(rowTen,     nzero,none,ntwo,nthree,nfour,nfive,nsix,nseven,neight,nnine,nten,neleven,ntwelve,nthirteen,nfourteen);
        Collections.addAll(rowEleven,  tezero,teone,tetwo,tethree,tefour,tefive,tesix,teseven,teeight,tenine,teten,teeleven,tetwelve,tethirteen,tefourteen);
        Collections.addAll(rowTwelve,  elzero,elone,eltwo,elthree,elfour,elfive,elsix,elseven,eleight,elnine,elten,eleleven,eltwelve,elthirteen,elfourteen);
        Collections.addAll(rowThirteen,twzero,twone,twtwo,twthree,twfour,twfive,twsix,twseven,tweight,twnine,twten,tweleven,twtwelve,twthirteen,twfourteen);
        Collections.addAll(rowFourteen,thizero,thione,thitwo,thithree,thifour,thifive,thisix,thiseven,thieight,thinine,thiten,thieleven,thitwelve,thithirteen,thifourteen);
        Collections.addAll(rowFiftteen,fozero,foone,fotwo,fothree,fofour,fofive,fosix,foseven,foeight,fonine,foten,foeleven,fotwelve,fothirteen,fofourteen);

        Collections.addAll(allRows,rowOne,rowTwo,rowThree,rowFour,rowFive,rowSix,rowSeven,rowEight,rowNine,rowTen,rowEleven,rowTwelve,rowThirteen,rowFourteen,rowFiftteen);

        Collections.addAll(colOne      ,zero ,ozero,tzero,thzero,fzero,fizero,szero,sezero,ezero,nzero,tezero,elzero,twzero,thizero,fozero);
        Collections.addAll(colTwo      ,one,oone,tone,thone,fone,fione,sone,seone,eone,none,teone,elone,twone,thione,foone);
        Collections.addAll(colThree    ,two,otwo,ttwo,thtwo,ftwo,fitwo,stwo,setwo,etwo,ntwo,tetwo,eltwo,twtwo,thitwo,fotwo);
        Collections.addAll(colFour     ,three,othree,tthree,ththree,fthree,fithree,sthree,sethree,ethree,nthree,tethree,elthree,twthree,thithree,fothree);
        Collections.addAll(colFive     ,four,ofour,tfour,thfour,ffour,fifour,sfour,sefour,efour,nfour,tefour,elfour,twfour,thifour,fofour);
        Collections.addAll(colSix      ,five,ofive,tfive,thfive,ffive,fifive,sfive,sefive,efive,nfive,tefive,elfive,twfive,thifive,fofive);
        Collections.addAll(colSeven    ,six,osix,tsix,thsix,fsix,fisix,ssix,sesix,esix,nsix,tesix,elsix,twsix,thisix,fosix);
        Collections.addAll(colEight    ,seven,oseven,tseven,thseven,fseven,fiseven,sseven,seseven,eseven,nseven,teseven,elseven,twseven,thiseven,foseven);
        Collections.addAll(colNine     ,eight,oeight,teight,theight,feight,fieight,seight,seeight,eeight,neight,teeight,eleight,tweight,thieight,foeight);
        Collections.addAll(colTen      ,nine,onine,tnine,thnine,fnine,finine,snine,senine,enine,nnine,tenine,elnine,twnine,thinine,fonine);
        Collections.addAll(colEleven   ,ten,oten,tten,thten,ften,fiten,sten,seten,eten,nten,teten,elten,twten,thiten,foten);
        Collections.addAll(colTwelve   ,eleven,oeleven,televen,theleven,feleven,fieleven,seleven,seeleven,eeleven,neleven,teeleven,eleleven,tweleven,thieleven,foeleven);
        Collections.addAll(colThirteen ,twelve,otwelve,ttwelve,thtwelve,ftwelve,fitwelve,stwelve,setwelve,etwelve,ntwelve,tetwelve,eltwelve,twtwelve,thitwelve,fotwelve);
        Collections.addAll(colFourteen ,thirteen,othirteen,tthirteen,ththirteen,fthirteen,fithirteen,sthirteen,sethirteen,ethirteen,nthirteen,tethirteen,elthirteen,twthirteen,thithirteen,fothirteen);
        Collections.addAll(colFiftteen ,fourteen,ofourteen,tfourteen,thfourteen,ffourteen,fifourteen,sfourteen,sefourteen,efourteen,nfourteen,tefourteen,elfourteen,twfourteen,thifourteen,fofourteen);

        Collections.addAll(allCols,colOne,colTwo,colThree,colFour,colFive,colSix,colSeven,colEight,colNine,colTen,colEleven,colTwelve,colThirteen,colFourteen,colFiftteen);

        Collections.addAll(dozero     ,fzero,thone,ttwo,othree,four);
        Collections.addAll(doone      ,fizero,fone,thtwo,tthree,ofour,five);
        Collections.addAll(dotwo      ,szero,fione,ftwo,ththree,tfour,ofive,six   );
        Collections.addAll(dothree    ,sezero,sone,fitwo,fthree,thfour,tfive,osix,seven);
        Collections.addAll(dofour     ,ezero,seone,stwo,fithree,ffour,thfive,tsix,oseven,eight);
        Collections.addAll(dofive     ,nzero,eone,setwo,sthree,fifour,ffive,thsix,tseven,oeight,nine );
        Collections.addAll(dosix      ,tezero,none,etwo,sethree,sfour,fifive,fsix,thseven,teight,onine,ten);
        Collections.addAll(doseven    ,elzero,teone,ntwo,ethree,sefour,sfive,fisix,fseven,theight,tnine,oten,eleven);
        Collections.addAll(doeight    ,twzero,elone,tetwo,nthree,efour,sefive,ssix,fiseven,feight,thnine,tten,oeleven,twelve);
        Collections.addAll(donine     ,thizero,twone,eltwo,tethree,nfour,efive,sesix,sseven,fieight,fnine,thten,televen,otwelve,thirteen);
        Collections.addAll(doten      ,fozero,thione,twtwo,elthree,tefour,nfive,esix,seseven,seight,finine,ften,theleven,ttwelve,othirteen,fourteen);
        Collections.addAll(doeleven   ,foone,thitwo,twthree,elfour,tefive,nsix,eseven,seeight,snine,fiten,feleven,thtwelve,tthirteen,ofourteen);
        Collections.addAll(dotwelve   ,fotwo,thithree,twfour,elfive,tesix,nseven,eeight,senine,sten,fieleven,ftwelve,ththirteen,tfourteen);
        Collections.addAll(dothirteen ,fothree,thifour,twfive,elsix,teseven,neight,enine,seten,seleven,fitwelve,fthirteen,thfourteen);
        Collections.addAll(dofourteen ,fofour,thifive,twsix,elseven,teeight,nnine,eten,seeleven,stwelve,fithirteen,ffourteen);
        Collections.addAll(dofifteen  ,fofive,thisix,twseven,eleight,tenine,nten,eeleven,setwelve,sthirteen,fifourteen);
        Collections.addAll(dosixteen  ,fosix,thiseven,tweight,elnine,teten,neleven,etwelve,sethirteen,sfourteen);
        Collections.addAll(doseventeen,foseven,thieight,twnine,elten,teeleven,ntwelve,ethirteen,sefourteen);
        Collections.addAll(doeightteen,foeight,thinine,twten,eleleven,tetwelve,nthirteen,efourteen);
        Collections.addAll(donineteen ,fonine,thiten,tweleven,eltwelve,tethirteen,nfourteen);
        Collections.addAll(dotwenty   ,foten,thieleven,twtwelve,elthirteen,tefourteen);

        Collections.addAll(diagonalOne,dozero,doone,dotwo,dothree,dofour,dofive,dosix,doseven,doeight,donine,doten,doeleven, dotwelve, dothirteen, dofourteen, dofifteen, dosixteen, doseventeen, doeightteen, donineteen, dotwenty);



        Collections.addAll(dtzero     ,tezero,elone,twtwo,thithree,fofour);
        Collections.addAll(dtone      ,nzero,teone,eltwo,twthree,thifour,fofive);
        Collections.addAll(dttwo      ,ezero,none,tetwo,elthree,twfour,thifive,fosix);
        Collections.addAll(dtthree    ,sezero,eone,ntwo,tethree,elfour,twfive,thisix,foseven);
        Collections.addAll(dtfour     ,szero,seone,etwo,nthree,tefour,elfive,twsix,thiseven,foeight);
        Collections.addAll(dtfive     ,fizero,sone,setwo,ethree,nfour,tefive,elsix,twseven,thieight,fonine);
        Collections.addAll(dtsix      ,fzero,fione,stwo,sethree,efour,nfive,tesix,elseven,tweight,thinine,foten);
        Collections.addAll(dtseven    ,thzero,fone,fitwo,sthree,sefour,efive,nsix,teseven,eleight,twnine,thiten,foeleven);
        Collections.addAll(dteight    ,tzero,thone,ftwo,fithree,sfour,sefive,esix,nseven,teeight,elnine,twten,thieleven,fotwelve);
        Collections.addAll(dtnine     ,ozero,tone,thtwo,fthree,fifour,sfive,sesix,eseven,neight,tenine,elten,tweleven,thitwelve,fothirteen);
        Collections.addAll(dtten      ,zero,oone,ttwo,ththree,ffour,fifive,ssix,seseven,eeight,nnine,teten,eleleven,twtwelve,thithirteen,fofourteen);
        Collections.addAll(dteleven   ,one,otwo,tthree,thfour,ffive,fisix,sseven,seeight,enine,nten,teeleven,eltwelve,twthirteen,thifourteen);
        Collections.addAll(dttwelve   ,two,othree,tfour,thfive,fsix,fiseven,seight,senine,eten,neleven,tetwelve,elthirteen,twfourteen  );
        Collections.addAll(dtthirteen ,three,ofour,tfive,thsix,fseven,fieight,snine,seten,eeleven,ntwelve,tethirteen,elfourteen);
        Collections.addAll(dtfourteen ,four,ofive,tsix,thseven,feight,finine,sten,seeleven,etwelve,nthirteen,tefourteen);
        Collections.addAll(dtfifteen  ,five,osix,tseven,theight,fnine,fiten,seleven,setwelve,ethirteen,nfourteen);
        Collections.addAll(dtsixteen  ,six,oseven,teight,thnine,ften,fieleven,stwelve,sethirteen,efourteen);
        Collections.addAll(dtseventeen,seven,oeight,tnine,thten,feleven,fitwelve,sthirteen,sefourteen);
        Collections.addAll(dteightteen,eight,onine,tten,theleven,ftwelve,fithirteen,sfourteen);
        Collections.addAll(dtnineteen ,nine,oten,televen,thtwelve,fthirteen,fifourteen);
        Collections.addAll(dttwenty   ,ten,oeleven,ttwelve,ththirteen,ffourteen);

        Collections.addAll(diagonalTwo,dtzero ,dtone,dttwo,dtthree,dtfour,dtfive,dtsix,dtseven,dteight,dtnine,dtten,dteleven,dttwelve,dtthirteen,dtfourteen,dtfifteen,dtsixteen,dtseventeen,dteightteen,dtnineteen,dttwenty);





    }

    public void reset() {

        xWins = 0;
        oWins = 0;
        draw = 0;
        x.setText("X win : "+xWins);
        o.setText("O wins :"+oWins);
        d.setText("Draws : "+draw);
        saveData();

    }


    public void clear(){

        for(TextField a : condition){
            a.setText("");
        }
        condition.clear();
        gameCheckResult = true;


    }
}
