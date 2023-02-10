public class Main {
    public static void main(String[] args) {

        ////////CREATION DES CLES POUR ALICE////////
        System.out.println("CREATION DES CLES D'ALICE");
        ClesPubPriv clesAlice = new ClesPubPriv();
        System.out.println("Module de chiffrement : " + clesAlice.getModChiffr());
        System.out.println("Exposant de chiffrement : " + clesAlice.getExpoChiffr());
        System.out.println("Exposant de Déchiffrement : " + clesAlice.getExpoDechiffr());
        System.out.println("");

        ///////creation du module RSA pour alice/////////////
        System.out.println("CREATION DU RSA SELON LES CLES D'ALICE");
        RSA rsaAlice = new RSA(clesAlice);
        System.out.println("");
        /////////récupération et traitement du texte/////////
        System.out.println("RECUPERATION ET TRAITEMENT DU TEXTE");
        System.out.println("bob tape son texte pour Alice");
        System.out.println("numerisation + decoupage du texte de bob");
        //c'est là que tu mets ta production bastien
        System.out.println("");

        /////OPERATION DE CRYPTAGE ////////////
        System.out.println("CRYPTAGE DU TEXTE AVEC CLE PUBLIC D'ALICE");
        //appel de la fonction avec RSA d'alice, RSA crypte avec clé public d'alice
        //affichage du texte crypté
        System.out.println("");

        /////////////OPERATION DE DECRYPTAGE////////////
        System.out.println("DECRYPTAGE DU TEXTE  CHIFFRE AVEC CLE PRIVEEE D'ALICE");
        //alice va  utilisé son RSA + clé privé pour  décrypter
        //affichage du message en clair
    }
}