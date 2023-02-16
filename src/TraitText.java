import java.io.UnsupportedEncodingException;

public class TraitText {

    public byte[] Numerisation(String textEntree)
    {
        String textTransf = TraitCarac(textEntree);
        byte[] ascii = null;
        if(textTransf != null)
        {
            try
            {
                ascii = textTransf.getBytes("US-ASCII");
            }
            catch (UnsupportedEncodingException e)
            {
                throw new RuntimeException(e);
            }
        }
        return ascii;
    }

    public String TraitCarac(String TextEntree)
    {
        String transfText = TextEntree;
        transfText = TextEntree.replace("\"", "\\\"");
        transfText = TextEntree.replace("'", "\\'");
        transfText = TextEntree.replace("\\", "\\\\");

        return transfText;
    }

    public String TraitCaracInvers(String texte)
    {
        String sortie = texte;
        sortie =  texte.replace("\\", "\"");
        sortie =  texte.replace("\\'", "'");
        sortie =  texte.replace("\\\\", "\\");

        return sortie;
    }
    public String Denumerisation(byte[] ascii)
    {
        String texte = null;
        try
        {
            texte = new String(ascii, "US-ASCII");
        }
        catch (UnsupportedEncodingException e)
        {
            throw new RuntimeException(e);
        }
        String textSortie = TraitCaracInvers(texte);

        return textSortie;
    }
}
