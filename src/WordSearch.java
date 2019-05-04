import net.didion.jwnl.JWNL;
import net.didion.jwnl.JWNLException;
import net.didion.jwnl.data.IndexWord;
import net.didion.jwnl.data.POS;
import net.didion.jwnl.data.Synset;
import net.didion.jwnl.dictionary.Dictionary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WordSearch {

    public String wordSearchNoun(String word) throws FileNotFoundException{
        try {
            JWNL.initialize(new FileInputStream("E:\\University Stuff\\jwnl14-rc2\\jwnl14-rc2\\config\\file_properties.xml"));
            Dictionary wordnet = Dictionary.getInstance();
            IndexWord noun = wordnet.getIndexWord(POS.NOUN, word);
            Synset[] nounsenses = noun.getSenses();
            for (Synset nounsense : nounsenses) {
                return nounsense.getGloss();
            }
        } catch (JWNLException ex) {
            throw new FileNotFoundException();
        }
        return "";
    }

    public String wordSearchVerb(String word) throws FileNotFoundException{
        try {
            JWNL.initialize(new FileInputStream("E:\\University Stuff\\jwnl14-rc2\\jwnl14-rc2\\config\\file_properties.xml"));
            Dictionary wordnet = Dictionary.getInstance();
            IndexWord verb = wordnet.getIndexWord(POS.VERB, word);
            Synset[] verbsenses = verb.getSenses();
            for (Synset verbsense : verbsenses) {
                return verbsense.getGloss();
            }
        } catch (JWNLException ex) {
            throw new FileNotFoundException();
        }
        return "";
    }
    public String wordSearchAdj(String word) throws FileNotFoundException{
        try {
            JWNL.initialize(new FileInputStream("E:\\University Stuff\\jwnl14-rc2\\jwnl14-rc2\\config\\file_properties.xml"));
            Dictionary wordnet = Dictionary.getInstance();
            IndexWord Adj = wordnet.getIndexWord(POS.ADJECTIVE, word);
            Synset[] Adjsenses = Adj.getSenses();
            for (Synset Adjsense : Adjsenses) {
                return Adjsense.getGloss();
            }
        } catch (JWNLException ex) {
            throw new FileNotFoundException();
        }
        return "";
    }
//    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            JWNL.initialize(new FileInputStream("E:\\University Stuff\\jwnl14-rc2\\jwnl14-rc2\\config\\file_properties.xml"));
//            Dictionary wordnet = Dictionary.getInstance();
//            IndexWord verb = wordnet.getIndexWord(POS.VERB,"run");
//            Synset[] verbsenses = verb.getSenses();
//            for (Synset verbsense : verbsenses) {
//                System.out.println(verb + ": " + verbsense.getGloss());
//            }
//
//        }
//        catch (JWNLException ex){
//
//        }
//    }
}