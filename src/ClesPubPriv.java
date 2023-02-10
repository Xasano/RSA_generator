import java.math.BigInteger;
import java.security.SecureRandom;

//attribut en dur. il n'y avait pas de spécification de jouer sur la longueur
//dans ce cas à rajouter dans le constructeur
/*
//////////////////////////////////////
////////POINT DE SITUATION///////////
le programme de génération des clés publics et privés
Son objectif est de fournir les clés en créant un objet ClesPubPriv

//////////////////////////////////////
*/
public class ClesPubPriv {
    private BigInteger p;
    private BigInteger q;
    private BigInteger indicEuler;
    private final BigInteger modChiffr;
    private final BigInteger expoChiffr;
    private final BigInteger expoDechiffr;
    private final int bitLength;

    public ClesPubPriv() {

        this.bitLength = 1024;
        this.p = probablePrime();
        this.q = probablePrime();
        this.modChiffr = CalculModChiffr();
        this.indicEuler = IndicEuler();
        this.expoChiffr = ExpoChiffr();
        this.expoDechiffr = ExpoDechiffr();
    }
    public BigInteger probablePrime()
    {
        SecureRandom rnd = new SecureRandom();
        return BigInteger.probablePrime(this.bitLength,rnd);
    }
    public BigInteger CalculModChiffr()
    {
        BigInteger modChiffr = this.p.multiply(this.q);
        return modChiffr;
    }

    public BigInteger IndicEuler()
    {
        //φ(n) = (p-1)*(q-1)
        BigInteger indicEuler = (this.p.subtract(BigInteger.ONE)).multiply(this.q.subtract(BigInteger.ONE));
        return indicEuler;
    }
    public BigInteger ExpoChiffr() {

        BigInteger expoChiffr = BigInteger.TWO;
        while (expoChiffr.compareTo(BigInteger.ONE) <= 0 ||
                expoChiffr.compareTo(this.indicEuler) >= 0 ||
                expoChiffr.gcd(this.indicEuler).compareTo(BigInteger.ONE) != 0)
        {
            expoChiffr = expoChiffr.add(BigInteger.ONE);
        }
        return expoChiffr;
    }
    public BigInteger ExpoDechiffr()
    {
        //d ≡ e^(-1) mod φ(n)
        BigInteger expoDechiffr = this.expoChiffr.modInverse(this.indicEuler);
        return expoDechiffr;
    }

    public BigInteger getModChiffr() {return modChiffr;}

    public BigInteger getExpoChiffr() {return expoChiffr;}

    public BigInteger getExpoDechiffr() {return expoDechiffr;}

    public ClesPubPriv GetClesPubPriv()
    {
        return this;
    }
}
