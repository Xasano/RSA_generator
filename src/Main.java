import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        //Par sûreté, il est couramment recommandé que la taille des clés RSA soit au moins de 2048 bits.
        int bitLength = 128;//longueur de clé à faire varier
        GenerCles generCles =new GenerCles(bitLength);

        /*
        ////////CREATION DES CLES POUR ALICE////////
        System.out.println("1 - CREATION DES CLES D'ALICE");
        GenerCles clesAlice = new GenerCles(bitLength);
        System.out.println("Module de chiffrement : " + clesAlice.getModulChiffr() );
        System.out.println("Exposant de chiffrement : " + clesAlice.getClesPublic());
        System.out.println("Exposant de Déchiffrement : " + clesAlice.getClesPrivee());
        System.out.println("");

        ///////CREATION MODULE RSA /////////////
        System.out.println("2 - CREATION DU RSA en prenant les clés d'Alice");
        RSA rsa = new RSA(clesAlice);
        System.out.println("");
        /////////RECUP + TRAITEMENT DU TEXTE/////////
        System.out.println("3 - RECUPERATION ET TRAITEMENT DU TEXTE");
        BigInteger messageClair = new BigInteger("123447");
        System.out.println("Le message clair de Bob : " + messageClair);
        ////////////////////////////////////////////////////////////////
        //c'est là que tu mets ta production BASTIEN///////////////////
        System.out.println("numerisation + decoupage du texte de bob");
        System.out.println("");
        /////OPERATION DE CRYPTAGE ////////////
        System.out.println("4 - CRYPTAGE DU TEXTE AVEC CLE PUBLIC D'ALICE");
        BigInteger messagCrypt = rsa.Crypt(messageClair);
        System.out.println("Le message crypté : " + messagCrypt);
        System.out.println("");
        /////////////OPERATION DE DECRYPTAGE////////////
        System.out.println("5 - DECRYPTAGE DU TEXTE  CHIFFRE AVEC CLE PRIVEEE D'ALICE");
        BigInteger messagDecrypt = rsa.Decrypt(messagCrypt);
        System.out.println("message décrypté  : " + messagDecrypt);
        //il va manquer la réunification des paquets ainsi que la retraduction des biginteger en string
        */

    }
}