package me.yuruekis.chaoshanbaicunxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhotosSwitcher {

    //private String villageName;

    private static final List<Photos> photosListQIAOLIN = new ArrayList<>(Arrays.asList(
            new Photos("Q1", "https://i.loli.net/2019/05/15/5cdbc01e8ee6b42054.jpg"),
            new Photos("Q2", "https://i.loli.net/2019/05/15/5cdbc02006a9c13930.jpg"),
            new Photos("Q3", "https://i.loli.net/2019/05/15/5cdbc02410af166409.jpg"),
            new Photos("Q4", "https://i.loli.net/2019/05/15/5cdbc02b2550480092.jpg"),
            new Photos("Q5", "https://i.loli.net/2019/05/15/5cdbc02cab5bc21228.jpg"),
            new Photos("Q6", "https://i.loli.net/2019/05/15/5cdbc02f0f3ca65433.jpg"),
            new Photos("Q7", "https://i.loli.net/2019/05/15/5cdbc03ce62c030022.jpg"),
            new Photos("Q8", "https://i.loli.net/2019/05/15/5cdbc0444bc8286156.jpg"),
            new Photos("Q9", "https://i.loli.net/2019/05/15/5cdbc04b7064473486.jpg"),
            new Photos("Q10", "https://i.loli.net/2019/05/15/5cdbc090d2c7061605.jpg"),
            new Photos("Q11", "https://i.loli.net/2019/05/15/5cdbc0990aa0626947.jpg"),
            new Photos("Q12", "https://i.loli.net/2019/05/15/5cdbc09b050f847309.jpg"),
            new Photos("Q13", "https://i.loli.net/2019/05/15/5cdbc09d258fe63645.jpg"),
            new Photos("Q14", "https://i.loli.net/2019/05/15/5cdbc0a22155154756.jpg"),
            new Photos("Q15", "https://i.loli.net/2019/05/15/5cdbc0a5b89ae55386.jpg"),
            new Photos("Q16", "https://i.loli.net/2019/05/15/5cdbc0a9e1c8820051.jpg"),
            new Photos("Q17", "https://i.loli.net/2019/05/15/5cdbc0dfd157135042.jpgg"),
            new Photos("Q18", "https://i.loli.net/2019/05/15/5cdbc0f73883466355.jpg"),
            new Photos("Q19", "https://i.loli.net/2019/05/15/5cdbc0f83b87a80976.jpg"),
            new Photos("Q20", "https://i.loli.net/2019/05/15/5cdbc1079aae945631.jpg"),
            new Photos("Q21", "https://i.loli.net/2019/05/15/5cdbc109a1d3556728.jpg"),
            new Photos("Q22", "https://i.loli.net/2019/05/15/5cdbc10b9f5da81366.jpg"),
            new Photos("Q23", "https://i.loli.net/2019/05/15/5cdbc10ba26d973576.jpg"),
            new Photos("Q24", "https://i.loli.net/2019/05/15/5cdbc10d3890e90054.jpg"),
            new Photos("Q25", "https://i.loli.net/2019/05/15/5cdbc10e3c0ce68785.jpg"),
            new Photos("Q26", "https://i.loli.net/2019/05/15/5cdbc135c9de489190.jpg"),
            new Photos("Q27", "https://i.loli.net/2019/05/15/5cdbc13759e9c44856.jpg"),
            new Photos("Q28", "https://i.loli.net/2019/05/15/5cdbc1376d8bd88676.jpg")
           // new Photos("Q", "https://i.loli.net/2019/05/10/5cd58fbe217da.jpg"),
            //new Photos("Q", "https://i.loli.net/2019/05/10/5cd58fed11d43.jpg"),
            //new Photos("Q", "https://i.loli.net/2019/05/10/5cd58fed3fd73.jpg"),
            /*new Photos("Q", "https://i.loli.net/2019/05/10/5cd58fed4563e.jpg"),
            new Photos("Q", "https://i.loli.net/2019/05/10/5cd58fed47529.jpg"),
            new Photos("Q", "https://i.loli.net/2019/05/10/5cd58fed49640.jpg"),
            new Photos("Q", "https://i.loli.net/2019/05/10/5cd58fed4b5cf.jpg"),
            new Photos("Q", "https://i.loli.net/2019/05/10/5cd58fed4d94d.jpg"),
            new Photos("Q", "https://i.loli.net/2019/05/10/5cd58fed4fb71.jpg"),
            new Photos("Q", "https://i.loli.net/2019/05/10/5cd58fed51c11.jpg"),
            new Photos("Q", "https://i.loli.net/2019/05/10/5cd58fed53d0a.jpg"),
            new Photos("Q", "https://i.loli.net/2019/05/10/5cd590030ac64.jpg"),
            new Photos("Q", "https://i.loli.net/2019/05/10/5cd590031f976.jpg"),
            new Photos("Q", "https://i.loli.net/2019/05/10/5cd5900326c68.jpg"),
            new Photos("Q", "https://i.loli.net/2019/05/10/5cd59003297ac.jpg"),
            new Photos("Q", "https://i.loli.net/2019/05/10/5cd59003331f4.jpg"),*/
            ));

    private static final List<Photos> photosListTAOSHAN = new ArrayList<>(Arrays.asList(new Photos("Q14", ""),
            new Photos("T1", "https://i.loli.net/2019/05/15/5cdbc33c4143027292.jpg"),
            new Photos("T2", "https://i.loli.net/2019/05/15/5cdbc33d9da5048341.jpg"),
            new Photos("T3", "https://i.loli.net/2019/05/15/5cdbc3492c77396012.jpg"),
            new Photos("T4", "https://i.loli.net/2019/05/15/5cdbc34a9793697538.jpg"),
            new Photos("T5", "https://i.loli.net/2019/05/15/5cdbc352a528062585.jpg"),
            new Photos("T6", "https://i.loli.net/2019/05/15/5cdbc3545d8bd88170.jpg"),
            new Photos("T7", "https://i.loli.net/2019/05/15/5cdbc354603b626309.jpg"),
            new Photos("T8", "https://i.loli.net/2019/05/15/5cdbc355146cd41769.jpg"),
            new Photos("T9", "https://i.loli.net/2019/05/15/5cdbc35561c4850226.jpg"),
            new Photos("T10", "https://i.loli.net/2019/05/15/5cdbc35825fb160393.jpg"),
            new Photos("T11", "https://i.loli.net/2019/05/15/5cdbc38f8c91e76703.jpg"),
            new Photos("T12", "https://i.loli.net/2019/05/15/5cdbc3bccbcfc96845.jpg"),
            new Photos("T13", "https://i.loli.net/2019/05/15/5cdbc3c7a8f3023327.jpg"),
            new Photos("T14", "https://i.loli.net/2019/05/15/5cdbc3cba47a354259.jpg"),
            new Photos("T15", "https://i.loli.net/2019/05/15/5cdbc3cbaadc862193.jpg"),
            new Photos("T16", "https://i.loli.net/2019/05/15/5cdbc3d7392e349402.jpg"),
            new Photos("T17", "https://i.loli.net/2019/05/15/5cdbc3d74a8b621769.jpg"),
            new Photos("T18", "https://i.loli.net/2019/05/15/5cdbc3e1c95ec40593.jpg"),
            new Photos("T19", "https://i.loli.net/2019/05/15/5cdbc3e3e21fd56796.jpg"),
            new Photos("T20", "https://i.loli.net/2019/05/15/5cdbc3e4825f929999.jpg")));

    private static final List<Photos> photosListJIALI = new ArrayList<>(Arrays.asList(
            new Photos("J1", "https://i.loli.net/2019/05/15/5cdbbdd7eab5737155.jpg"),
            new Photos("J2", "https://i.loli.net/2019/05/15/5cdbbde6d830996277.jpg"),
            new Photos("J3", "https://i.loli.net/2019/05/15/5cdbbdeea16ab49766.jpg"),
            new Photos("J4", "https://i.loli.net/2019/05/15/5cdbbdf6e864928339.jpg"),
            new Photos("J5", "https://i.loli.net/2019/05/15/5cdbbdfa259ee89812.jpg"),
            new Photos("J6", "https://i.loli.net/2019/05/15/5cdbbdfa6161f36539.jpg"),
            new Photos("J7", "https://i.loli.net/2019/05/15/5cdbbdffd1dda19171.jpg"),
            new Photos("J8", "https://i.loli.net/2019/05/15/5cdbbe03e208c84061.jpg"),
            new Photos("J9", "https://i.loli.net/2019/05/15/5cdbbe3aec6f318484.jpg"),
            new Photos("J10", "https://i.loli.net/2019/05/15/5cdbbe3b4dffd31307.jpg"),
            new Photos("J11", "https://i.loli.net/2019/05/15/5cdbbe422166357145.jpg"),
            new Photos("J12", "https://i.loli.net/2019/05/15/5cdbbe431880364763.jpg"),
            new Photos("J13", "https://i.loli.net/2019/05/15/5cdbbe434753e28305.jpg"),
            new Photos("J14", "https://i.loli.net/2019/05/15/5cdbbe4374c3613642.jpg"),
            new Photos("J15", "https://i.loli.net/2019/05/15/5cdbbe46c5f6955894.jpg"),
            new Photos("J16", "https://i.loli.net/2019/05/15/5cdbbe482395237190.jpg"),
            new Photos("J17", "https://i.loli.net/2019/05/15/5cdbbe7893ee098426.jpg"),
            new Photos("J18", "https://i.loli.net/2019/05/15/5cdbbe7895e9171351.jpg"),
            new Photos("J19", "https://i.loli.net/2019/05/15/5cdbbe7898a6950716.jpg"),
            new Photos("J20", "https://i.loli.net/2019/05/15/5cdbbe79297a984147.jpg"),
            new Photos("J21", "https://i.loli.net/2019/05/15/5cdbbe7c6026a52626.jpg"),
            new Photos("J22", "https://i.loli.net/2019/05/15/5cdbbe7dc8d1e92784.jpg")));

    public static List<Photos> getPhotosList(String villageName) {
        switch (villageName) {
            case "乔林村":
                return photosListQIAOLIN;
            case "桃山村":
                return photosListTAOSHAN;
            case "贾里村":
                return photosListJIALI;
            default:
                break;
        }
        return photosListJIALI;
    }
}
