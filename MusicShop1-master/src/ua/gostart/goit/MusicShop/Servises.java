package ua.gostart.goit.MusicShop;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Servises {



    List<MusicalInstrument> list = new ArrayList();


    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order, MusicShop1 musicShop1) {


        Set<String> strings = order.keySet();


        for (String k : strings) {
            if (k.equals("guitar") && order.get(k) <= musicShop1.getGuitars().size()) {

                for (int i = 0; i < order.get(k); i++) {
                    list.add(musicShop1.getGuitars().get(i));
                }
            }
               else if (k.equals("trumpet") && order.get(k) <= musicShop1.getTrumpets().size()) {

                for (int i = 0; i < order.get(k); i++) {
                    list.add(musicShop1.getTrumpets().get(i));
                }
                } else if (k.equals("piano") && order.get(k) <= musicShop1.getPianos().size()) {

                for (int i = 0; i < order.get(k); i++) {
                    list.add(musicShop1.getPianos().get(i));
                }
                }
            }

        return list;
    }
}