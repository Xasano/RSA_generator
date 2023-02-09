import java.util.HashMap;

public class BlocNum {
    private final String strOrigin;
    private final int nbDecoup;
    //Definition d'un dictionnaire de données pour l'alphabet en minuscule.
    private final HashMap<Character, Integer> nbLetterDic = new HashMap<>() {{put('a',1001);put('b',1002);put('c',1003);put('d',1004);put('e',1005);put('f',1006);put('g',1007);put('h',1008);put('i',1009);put('j',1010);put('k',1011);put('l',1012);put('m',1013);put('n',1014);put('o',1015);put('p',1016);put('q',1017);put('r',1018);put('s',1019);put('t',1020);put('u',1021);put('v',1022);put('w',1023);put('x',1024);put('y',1025);put('z',1026);}};
    private int[] strNum;
    private String[] strTrans;

    public BlocNum(String str, int n_cle) {
        strOrigin = str;
        nbDecoup = n_cle-1; //Vu que message numérique en tranche < nb de chiffre de n alors on peut juste faire n_cle -1
        Numerisation();
        Decoup();
    }

    private void Numerisation(){
        char[] chars = this.strOrigin.toCharArray();
        int[] res = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if(nbLetterDic.get(chars[i]) != null){
                res[i] = nbLetterDic.get(chars[i]);
            } else {
                res[i] = chars[i];
            }
        }
        this.strNum = res;
    }

    private void Decoup(){
        //int[] to String | Ex : {1,2,3} -> 123
        StringBuilder sb = new StringBuilder();
        for (int i : strNum) {
            sb.append(i);
        }
        String strTemp = sb.toString();
        // Calcul de la coupe
        int tailleCoup = strTemp.length()/nbDecoup;
        if (tailleCoup-strTemp.length() != 0) {
            tailleCoup += strTemp.length() - (tailleCoup*nbDecoup);
        }
        // Définition d'une variable temporaire
        String[] strTransTemp = new String[nbDecoup];
        // Début de la découpe du string
        int j = 0;
        for (int i = 0; i < nbDecoup; i++) {
            try {
                strTransTemp[i] = strTemp.substring(j, j+tailleCoup);
                j += tailleCoup;
            } catch(Exception e) {
                int reste = strTemp.length() - j;
                strTransTemp[i] = strTemp.substring(j, j+reste);
            }
        }
        this.strTrans = strTransTemp;
    }

    public String[] getStrTrans() {
        return strTrans;
    }

    public int[] getStrNum() {
        return strNum;
    }
}
