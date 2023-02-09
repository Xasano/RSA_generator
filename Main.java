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

        /////////récupération et traitement du texte/////////
        System.out.println("bob tape son texte pour Alice");
        System.out.println("numerisation + decoupage du texte de bob");
        //c'est là que tu mets ta production bastien

        /////OPERATION DE CRYPTAGE ////////////
        //appel de la fonction avec RSA d'alice, RSA crypte avec clé public d'alice
        //affichage du texte crypté

        /////////////OPERATION DE DECRYPTAGE////////////
        //alice va  utilisé son RSA + clé privé pour  décrypter
        //affichage du message en clair
    }
}