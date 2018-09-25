package com.pramudana.sam.wisatabelajarmap.Model;

import java.util.ArrayList;

/**
 * Created by sampramudana on 9/24/18.
 */

public class WisataData {

    public static String[][] dataWisata = new String[][]{
            {"The World Landmarks Merapi Park", "https://4.bp.blogspot.com/-uVeQAjkR8-A/WVZ7sDFVvPI/AAAAAAAAOYw/acXKtZS2Sfkh4sjEDmzQGpDEFUAQKpPQACLcBGAs/s640/the%2Bworld%2Blandmarks.jpg", "29.610200", "-98.218060"},
            {"Transmart Carrefour Maguwo", "http://cdn2.tstatic.net/jogja/foto/bank/images/trans-studio-mini_20170331_173959.jpg", "-6.177460", "106.791477"},
            {"Pantai Nglambor", "https://www.pantainesia.com/wp-content/uploads/2018/03/Objek-Wisata-Pantai-Nglambor.jpg", "-2.779020", "114.362610"},
            {"Jogja Bay Waterpark", "https://i.ytimg.com/vi/4nFwW2SWzUc/maxresdefault.jpg", "30.127910", "-85.535100"},
            {"Kebun Teh Nglinggo", "http://1.bp.blogspot.com/-X8lpmuQQUGk/VOFJL3cBHiI/AAAAAAAAAng/qxbbwzlS5Ps/s1600/IMG_6015.JPG", "1.486080", "103.753960"},
            {"Umbul Ponggok Klaten", "https://dolanyok.com/wp-content/uploads//Umbul-Ponggok-Nikah.jpg", "-7.609160", "110.640790"},
            {"Tebing Breksi", "https://rajatourjogja.com/wp-content/uploads/2018/07/tebng-breksi-2.jpg", "1.045950", "103.350080"},
            {"Hutan Mangrove Kulon Progo", "https://www.dakatour.com/wp-content/uploads/2016/10/rute-menuju-hutan-mangrove-kulon-progo.jpg", "-7.863730", "110.154450"},
            {"Pantai Pok Tunggal", "https://4.bp.blogspot.com/-padUx0X7Eok/VswawBbfM7I/AAAAAAAAA6k/wCs9EZs7_ro/s1600/poktunggal3.jpg", "5.568960", "100.504020"},
            {"Goa Kalisuci", "https://assets-a1.kompasiana.com/items/album/2017/09/11/cavetubing-di-kalisuci-lebih-asik-bersama-teman-teman-59b699cdf22f664e36482cf4.jpg", "15.484280", "73.823010"},
            {"Taman Sari", "http://blog.reservasi.com/wp-content/uploads/2017/01/istana-air-taman-sari-yogyakarta-11.jpg", "-6.388470", "106.643600"},
            {"Air Terjun Sri Gethuk", "https://iklantravel.com/wp-content/uploads/2017/05/air-terjun-sri-getuk-gunungkidul2-1024x681.jpg", "4.642290", "100.712370"},
            {"Pantai Baron, Krakal dan Kukup", "http://panduanwisata.id/files/2012/04/kukup-beach.jpg", "-8.129073", "110.548611"},
            {"Wisata Kalibiru Kulon Progo", "https://eksotisjogja.com/wp-content/uploads/2016/10/14719049_660490354108973_144083615771262976_n.jpg", "-7.863730", "110.154450"},
            {"Hutan Pinus Mangunan", "https://i0.wp.com/www.maioloo.com/maioloo/wp-content/uploads/2015/12/View-Hutan-Pinus-Mangunan.jpg", "43.475470", "1.399440"},
            {"Kebun Buah Mangunan", "http://www.trivindo.com/data/upload/2016/12/kebun-buah-mangunan.jpg", "3.354120", "99.180540"},
            {"Jurang Tembelan", "https://3.bp.blogspot.com/-py0BySngV5I/WRWanB5QHzI/AAAAAAAAFKc/Ey-_QetoO0AN0oMRSnbdKX11shQ_X9H_ACLcB/s1600/jurang-tembelan-mangunan-bantul.jpg", "-7.9401573", "110.4277276"},
            {"Gunung Api Purba Nglanggeran", "https://allesgroen.files.wordpress.com/2017/09/eksotisme-gunung-api-purba-nglanggeran.jpg", "-7.8430295", "110.5473471"},
            {"Candi Ijo", "https://i0.wp.com/www.jogja.co/wp-content/uploads/2013/11/Candi-Ijo.jpg?fit=800%2C533", "-7.7838266", "110.5096661"},
            {"Pantai Jogan Jogja", "http://www.xtsquare.co.id/wp-content/uploads/2016/03/wisata-pantai-jogan-wonosari-gunungkidul-yogyakarta.jpeg", "-8.1800924", "110.6676083"},
            {"Alun - Alun Kidul", "https://i2.wp.com/www.njogja.co.id/wp-content/uploads/2014/07/alun-alun-kidul-yogyakarta.jpg", "-7.8118423", "110.3609755"},
            {"Taman Pelangi Monjali", "https://tegas.co/wp-content/uploads/2017/04/IMG_20170410_185309.jpg", "-7.7505206", "110.3665162"},
            {"Bukit Bintang Patuk", "https://visitingjogja.com/wp-content/uploads/2017/11/bukitbintang.jpg", "-7.8456519", "110.4780534"},
            {"Malioboro", "https://eksotisjogja.com/wp-content/uploads/2016/09/Malioboro-Street-Sign.jpg", "-7.7926447", "110.363699"},
            {"Jalan Prawirotaman", "https://labirutour.com/web/wp-content/uploads/2017/12/Jalan-Prawirotaman.jpg", "-7.8191778", "110.3686766"}
    };

    public static ArrayList<Wisata> getWisataJogja(){
        Wisata wisata = null;
        ArrayList<Wisata> list = new ArrayList<>();
        for (int i = 0; i < dataWisata.length; i++){
            wisata = new Wisata();
            wisata.setNama(dataWisata[i][0]);
            wisata.setGambar(dataWisata[i][1]);
            wisata.setLati(Double.parseDouble(dataWisata[i][2]));
            wisata.setLongi(Double.parseDouble(dataWisata[i][3]));
            list.add(wisata);
        }
        return list;
    }
}