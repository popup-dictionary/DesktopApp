import net.didion.jwnl.JWNL;
import net.didion.jwnl.JWNLException;
import net.didion.jwnl.data.IndexWord;
import net.didion.jwnl.data.POS;
import net.didion.jwnl.data.Synset;
import net.didion.jwnl.dictionary.Dictionary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class WordSearch {
List<String> List=new ArrayList();

    public java.util.List<String> wordSearchNoun(String word) throws FileNotFoundException{
        try {
            JWNL.initialize(new FileInputStream("lib/file_properties.xml"));
            Dictionary wordnet = Dictionary.getInstance();
            IndexWord noun = wordnet.getIndexWord(POS.NOUN, word);
            Synset[] nounsenses = noun.getSenses();
            for (Synset nounsense : nounsenses) {
               List.add(nounsense.getGloss());
                // return nounsense.getGloss();
            }
            return List;
        } catch (JWNLException ex) {
            throw new FileNotFoundException();
        }
    }

    public java.util.List<String> wordSearchVerb(String word) throws FileNotFoundException{
        try {
            JWNL.initialize(new FileInputStream("lib/file_properties.xml"));
            Dictionary wordnet = Dictionary.getInstance();
            IndexWord verb = wordnet.getIndexWord(POS.VERB, word);
            Synset[] verbsenses = verb.getSenses();
            for (Synset verbsense : verbsenses) {
                List.add(verbsense.getGloss());

            }
            return List;
        } catch (JWNLException ex) {
            throw new FileNotFoundException();
        }
    }

    public java.util.List<String> wordSearchAdj(String word) throws FileNotFoundException{
        try {
            JWNL.initialize(new FileInputStream("lib/file_properties.xml"));
            Dictionary wordnet = Dictionary.getInstance();
            IndexWord Adj = wordnet.getIndexWord(POS.ADJECTIVE, word);
            Synset[] Adjsenses = Adj.getSenses();
            for (Synset Adjsense : Adjsenses) {
                List.add(Adjsense.getGloss());
            }
            return List;
        } catch (JWNLException ex) {
            throw new FileNotFoundException();
        }
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