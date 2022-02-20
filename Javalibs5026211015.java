import javax.swing.*;



        public class JavaLibs5026211015 {
            public static void main(String[] args) {

                //1 Perkenalan Nama dulu deh
                String name = JOptionPane.showInputDialog("Holaa! Namaku Avicenna, Namamu siapa?");
                JOptionPane.showMessageDialog(null, "Widihh, halo "+name+", Salam Kenal yaa!");

                //2 Gender nih
                String[] acceptablevalues = {"Laki - Laki" , "Perempuan"};
                String gender = (String)JOptionPane.showInputDialog(null, "Kamu", "jenis kelamin",2,null,acceptablevalues,acceptablevalues[1]);
                JOptionPane.showMessageDialog(null, "Oh, ternyata kamu "+gender+".");

                //3 Age
                String age = JOptionPane.showInputDialog("Kalau boleh tau sekarang umur berapa?");
                int ageConvert=Integer.parseInt(age);
                if ( ageConvert > 40 ) {
                    JOptionPane.showMessageDialog(null, "umur kamu lebih dari aku yaa rupanyaa..");
                } else if ( ageConvert == 18 ) {
                    JOptionPane.showMessageDialog(null, "wahh "+name+" seumuran nih.");
                } else {
                    JOptionPane.showMessageDialog(null, "oalaaa "+age+".");
                }

                //4 Asal Provinsi
                String School=JOptionPane.showInputDialog("Asal provinsi mu darimana nih kalau boleh tau ? |1 = Jawa 2 = Sumatera 3 = Kalimantan 4 = Sulawesi 5 = Papua |");
                int SchoolConvert=Integer.parseInt(School);

                if (SchoolConvert == 1 ){
                    JOptionPane.showMessageDialog(null,"Wihh "+name+" asalnya dari jawa nih");
                }else if (SchoolConvert == 2 ) {
                    JOptionPane.showMessageDialog(null, "Wahh, lumayan jauh yaa.");
                }else if (SchoolConvert == 3) {
                    JOptionPane.showMessageDialog(null, "Sama nihh aku dari Kalimantan jugaa");
                }else if (SchoolConvert == 4) {
                    JOptionPane.showMessageDialog(null, "Wahh dari Sulawesi yaa ternyata");
                }else if (SchoolConvert == 5) {
                   JOptionPane.showMessageDialog (null, "Ini paling jauhhh nihh dari daerah asalku");
                }else {
                    JOptionPane.showMessageDialog(null, "yahh harusnya jawab nya 1,2,3,4,5 gituu");
                }


                //5 Cobaa sekarang tinggi badan
                String height=JOptionPane.showInputDialog("Coba deh tinggi badan kamu berapa?");
                int heightconvert=Integer.parseInt(height);
                if ( heightconvert > 200 ) {
                    JOptionPane.showMessageDialog(null, "Bentar ini kamu ada keturunan atau emang titan ? "+name+"!");
                } else if ( heightconvert == 176 ) {
                    JOptionPane.showMessageDialog(null, "nahh"+name+" sama nih tinggi kita");
                } else if ( heightconvert < 100 ) {
                    JOptionPane.showMessageDialog(null, "udah dehh jangan bohong gitu");
                } else if ( heightconvert > 176 ) {
                    JOptionPane.showMessageDialog(null, ""+name+" lebih tinggi dari aku yaa");
                } else {
                    JOptionPane.showMessageDialog(null, ""+name+""+height+"wahhh keren yaa");
                }

                //
                JOptionPane.showMessageDialog(null, "aku bisa bikin kalkulator loh coba deh kamu isi");

                // ini kita bikin Kalkulator bukan desimal
                String number1 = JOptionPane.showInputDialog("masukin satu angka (jangan desimal yak integer nih soalnya hehe)");
                int number11 = Integer.parseInt(number1);
                String number2 = JOptionPane.showInputDialog("masukin lagii");
                int number22 = Integer.parseInt(number2);
                JOptionPane.showMessageDialog(null,"jadi angka nya" +number11+" sama kan "+number22);
                String operator = JOptionPane.showInputDialog(" Sekaranag kamu pilih nih mau dikali (1), dibagi (2), ditambah (3) atau dikurang nih (4) nih ? ( masukin angka sesuai yang kamu mau ya)");
                int operatorx = Integer.parseInt(operator);
                int result;
                if (operatorx == 1){
                    result = number11 * number22;
                    JOptionPane.showMessageDialog(null,"Hasilnya Perkalian nya tuh " +result);
                }else if(operatorx == 2){
                    result = number11 / number22;
                    JOptionPane.showMessageDialog(null,"Hasilnya Pembagian nya tuh " +result);
                }else if (operatorx == 3) {
                    result = number11 + number22;
                    JOptionPane.showMessageDialog(null, "Hasil Penjumlahan nya tuh" +result);
                }else if (operatorx == 4) {
                    result = number11 - number22;
                    JOptionPane.showMessageDialog(null, "Hasil Pengurangan nya tuh" +result);
                } else {
                    JOptionPane.showMessageDialog(null,"Kamu harusnya masukin 1,2,3,4 jangan begitu ya lain kali");
                }

                //
                JOptionPane.showMessageDialog(null, "Sekarang cobain kalkulator yang desimal yaa");

                // ini  Kalkulator double (yang desimal)
                String number3 = JOptionPane.showInputDialog("Masukin satu angka lagi tapi sekarang yang desimal okeh");
                double number33 = Double.parseDouble(number3);
                String number4 = JOptionPane.showInputDialog("Sekarang masukkin satu angka lagi");
                double number44 = Double.parseDouble(number4);
                JOptionPane.showMessageDialog(null,"bener ya angka nya tuh" +number33+" dan "+number44);
                String operatorz = JOptionPane.showInputDialog("Mau ditambah (1), dikurang (2), dikali (3), dibagi (4) nih ?)");
                double operatory = Double.parseDouble(operatorz);
                double result2;
                if (operatory == 1){
                    result2 = number33 + number44;
                    JOptionPane.showMessageDialog(null,"Hasil Penjumlahannya tuh " +result2);
                }else if(operatory == 2){
                    result2 = number33 - number44;
                    JOptionPane.showMessageDialog(null,"Hasil Pengurangannya tuh " +result2);
                }else if (operatory == 3) {
                    result2 = number33 * number44;
                    JOptionPane.showMessageDialog(null, "Hasil Perkaliannya tuh" +result2);
                } else if (operatory == 4) {
                    result2 = number33 / number44;
                    JOptionPane.showMessageDialog(null, "Hasil Pembagiannya tuh" + result2);
                } else {
                    JOptionPane.showMessageDialog(null,"yahh ga asik kamu mah harusnya ikutin angka nya sesuai dong, udah deh lanjut");
                }

                //end
                JOptionPane.showMessageDialog(null, "makasih banyak yaa "+name+" udah mau kenalan dan cobain kalkulator yang aku punya, Ciaoo!!");

            }
        }
