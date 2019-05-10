package me.yuruekis.chaoshanbaicunxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhotosSwitcher {

    //private String villageName;

    private static final List<Photos> photosListQIAOLIN = new ArrayList<>(Arrays.asList(
            new Photos("Q1", "https://i.loli.net/2019/05/08/5cd2a2d5e0d82.jpg"),
            new Photos("Q2", "https://i.loli.net/2019/05/08/5cd2a2d64beb5.jpg"),
            new Photos("Q3", "https://i.loli.net/2019/05/08/5cd2a2d658f83.jpg"),
            new Photos("Q4", "https://i.loli.net/2019/05/08/5cd2a2d67faf9.jpg"),
            new Photos("Q5", "https://i.loli.net/2019/05/08/5cd2a2d69c637.jpg"),
            new Photos("Q6", "https://i.loli.net/2019/05/08/5cd2a2d6b00f0.jpg"),
            new Photos("Q7", "https://i.loli.net/2019/05/08/5cd2a2d6b23e8.jpg"),
            new Photos("Q8", "https://i.loli.net/2019/05/08/5cd2a2d6c025c.jpg"),
            new Photos("Q9", "https://i.loli.net/2019/05/08/5cd2a2d6c3775.jpg"),
            new Photos("Q10", "https://i.loli.net/2019/05/08/5cd2a2d6c5d63.jpg"),
            new Photos("Q11", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"),
            new Photos("Q12", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg")));

    private static final List<Photos> photosListTAOSHAN = new ArrayList<>(Arrays.asList(new Photos("门", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("庭院", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("广场", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("房屋", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("住宅", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("院子", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg")));

    private static final List<Photos> photosListJIALI = new ArrayList<>(Arrays.asList(new Photos("大", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("庭院", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("广场", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("房屋", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("住宅", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg"), new Photos("院子", "https://ws1.sinaimg.cn/mw690/0071ouepgy1g1k00uuei0j31hc0u0quu.jpg")));

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
