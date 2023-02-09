import java.math.BigInteger;

public class RSA {

    private BigInteger modulChiffr;
    private BigInteger expoChiffr;
    private BigInteger expoDechiffr;

    public RSA(ClesPubPriv clesPubPriv) {
        this.modulChiffr = clesPubPriv.getModChiffr();
        this.expoChiffr = clesPubPriv.getExpoChiffr();
        this.expoDechiffr = clesPubPriv.getExpoDechiffr();
    }

    public BigInteger cryptage(BigInteger texteClair){
        //formule x = y^e mod (n)
        return texteClair;
    }

    public BigInteger Decryptage(BigInteger texteCrypte){
        //formule y = x^d mod (n)
        return texteCrypte;
    }
}
