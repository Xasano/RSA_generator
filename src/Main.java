public class Main {
    public static void main(String[] args) {

        //creation des clés d'alice
        ClesPubPriv clesAlice = new ClesPubPriv();
        ClesPubPriv clesPubPriv = clesAlice.GetClesPubPriv();
        //creatino du RSA selon les clés d'alice
        RSA rsaAlice = new RSA(clesAlice);
        //bob tape son texte
        //numerisation + decoupage du texte de bob
        //appel de la fonction avec RSA d'alice, RSA crypte avec clé public d'alice
        //affichage du texte crypté
        //alice va  utilisé son RSA + clé privé pour  décrypter
        //affichage du message en clair
    }
}