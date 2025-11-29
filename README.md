Pertanyaan percobaan 1 
1. Apakah fungsi tanpa parameter selalu harus bertipe void?
  Jawab=Tidak, Fungsi tanpa parameter tidak harus bertipe void.Walaupun tidak punya parameter, fungsi tetap boleh memakai tipe lain seperti int, String, atau tipe data lainnya, asalkan fungsi tersebut mengembalikan nilai.

2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
 Jawab=daftar menu bisa ditampilkan tanpa menggunakan fungsi Menu().Caranya dengan menuliskan semua perintah System.out.println() langsung di dalam fungsi main tanpa memanggil fungsi lain.

3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.
 Jawab=Keuntungan menggunakan fungsi Menu():
-Kode lebih rapi dan terstruktur karena bagian menu dipisahkan dari main.
-Lebih mudah dipanggil ulang jika menu perlu ditampilkan lagi di bagian lain program.
-Mudah diperbaiki karena jika ada perubahan harga atau nama menu, cukup mengubah di satu tempat saja.
-Menghindari duplikasi kode, sehingga program lebih efisien dan tidak terlalu panjang.

4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).
 Jawab=Alur eksekusi program saat Menu() dipanggil:
-Program dijalankan dan mulai dari fungsi main.
-Di dalam main, program menemukan perintah memanggil Menu().
-Program berpindah ke dalam fungsi Menu().
-Semua perintah untuk menampilkan menu dijalankan satu per satu.
-Daftar menu muncul di layar.
-Setelah selesai, program kembali lagi ke main dan melanjutkan eksekusi (atau selesai jika tidak ada perintah lain). 


pertanyaan percobaan 2 
1. Apakah kegunaan parameter di dalam fungsi?
  Jawab=Parameter digunakan untuk mengirim data dari luar ke dalam fungsi.Dengan parameter, fungsi bisa menerima nilai, mengolahnya, dan menghasilkan output yang sesuai tanpa harus menulis ulang kode di dalam fungsi.

2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?
   Jawab=Fungsi Menu() menggunakan parameter namaPelanggan dan isMember karena fungsi tersebut membutuhkan informasi dari luar untuk diproses.namaPelanggan digunakan untuk menampilkan sapaan atau identitas pelanggan, sedangkan isMember digunakan untuk menentukan apakah pelanggan mendapatkan keuntungan tertentu (misalnya diskon member).Dengan parameter ini, fungsi Menu() menjadi lebih fleksibel dan bisa menampilkan menu sesuai data pelanggan yang berbeda-beda.

3. Apakah parameter sama dengan variabel? Jelaskan.
   Jawab=Parameter tidak sama dengan variabel, tetapi keduanya saling berhubungan.Parameter adalah variabel khusus yang berada di dalam tanda kurung fungsi dan digunakan untuk menerima nilai dari luar fungsi.Sedangkan variabel biasa adalah penyimpanan data di dalam program yang tidak selalu berhubungan dengan fungsi.

4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?
   Jawab=Parameter isMember bekerja sebagai penanda apakah pelanggan adalah member atau bukan.
Di dalam fungsi, nilai isMember dicek menggunakan kondisi (if).
-Jika isMember = true, maka program biasanya menampilkan keuntungan tambahan, seperti diskon atau pesan khusus member.
-Jika isMember = false, maka program menampilkan menu tanpa diskon atau tanpa keuntungan member.

5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?
   Jawab=Jika fungsi Menu() memiliki parameter tetapi dipanggil tanpa memberikan nilai untuk parameter tersebut, maka program akan error (tidak bisa dijalankan).Java akan menampilkan pesan kesalahan karena fungsi membutuhkan data namaPelanggan dan isMember, tetapi tidak diberikan saat dipanggil.

6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.
   Jawab= commit modifikasi no 6

7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.
   Jawab= Jika nama pelanggan "Budi", pelanggan member, dan kode promo "DISKON30", maka pemanggilan fungsi yang benar adalah:
Menu("Budi", true, "DISKON30");

8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.
  Jawab=Ya, penggunaan parameter namaPelanggan dan isMember membuat program lebih mudah dibaca dan dikembangkan.
Alasannya: dengan parameter, fungsi tidak bergantung pada nilai yang ditulis langsung di dalamnya, sehingga fungsi menjadi lebih fleksibel, mudah digunakan untuk pelanggan yang berbeda-beda, mudah diubah, dan kode terlihat lebih rapi serta lebih profesional dibandingkan jika nilai tersebut ditulis langsung di dalam fungsi.

pertanyaan percobaan 3
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
 Jawab=1. Kapan fungsi membutuhkan nilai kembalian (return value)?
Fungsi membutuhkan nilai kembalian jika hasil perhitungannya masih akan dipakai lagi oleh program.
Contohnya pada program kafe:
Contoh: fungsi yang butuh return → hitungTotalHarga()
Fungsi ini perlu return karena hasil perhitungannya (total harga) harus dikirim kembali ke main untuk ditampilkan.
2. Kapan fungsi tidak perlu mengembalikan nilai?
Fungsi tidak perlu return jika tugasnya hanya menampilkan sesuatu atau melakukan proses tanpa menghasilkan nilai yang harus digunakan lagi.
Contoh: fungsi tanpa return → Menu()
Fungsi Menu() hanya menampilkan informasi menu, promo, dan salam, sehingga tidak perlu mengembalikan nilai apa pun

2. Fungsi hitung Total Harga NoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
  Jawab=Tipe data nilai kembalian fungsi hitungTotalHarga
int
Karena fungsi ini mengembalikan total harga dalam bentuk angka (bilangan bulat).
Dua parameter yang digunakan fungsi hitungTotalHarga
1. int pilihanMenu
Artinya: nomor menu yang dipilih pelanggan (1 sampai 6).
Digunakan untuk menentukan harga per item berdasarkan menu yang dipilih.
2. int banyakItem
Artinya: jumlah pesanan atau berapa item yang ingin dibeli pelanggan.
Digunakan untuk menghitung total harga = harga satuan × jumlah item.

3. Modifikasi kode di atas sehingga fungsi hitung Total Harga NoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.
  Jawab= commit modifikasi no 3

4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?
  Jawab= commit modifikasi no 4

pertanyaan percobaan 4
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String...
namaPengunjung!
 Jawab=String... namaPengunjung dipakai agar fungsi dapat menerima banyak nama sekaligus tanpa batas, sehingga lebih fleksibel dan mudah digunakan.
 
2. Modifikasi method daftar Pengunjung menggunakan for-each loop.
  Jawab= commit modifikasi no 2

3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
  Jawab= Tidak bisa.Dalam Java, varArgs hanya boleh ada satu dalam satu fungsi, dan harus ditempatkan di bagian paling akhir parameter.
Ini aturan resmi Java:
Hanya satu varArgs per fungsi.
VarArgs harus menjadi parameter terakhir.
Karena itu, fungsi seperti berikut tidak diperbolehkan:
// SALAH → dua varArgs dalam satu fungsi
void contoh(int... angka, String... teks) { }
// CONTOH YANG BENAR 
void contoh(int jumlah, String... nama) { }
Artinya:
ng... nama = satu-satunya varArgs, dan berada di akhir 

4. Jelaskan apa yang terjadi jika fungsi daftar Pengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?
  Jawab=Tidak error saat kompilasi,Tidak error saat dijalankan,Program tetap berjalan normal,Output hanya,menampilkan judul tanpa daftar nama
Karena varArgs bersifat fleksibel dan bisa menerima 0 data.

pertanyaan percobaan 5 
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!
 Jawab=Tahapan dan urutan eksekusi program pada Percobaan 5 adalah:
1.Program mulai menjalankan fungsi main().
2.Program membuat Scanner untuk membaca input.
3.Program meminta pengguna memasukkan panjang, lebar, dan tinggi, lalu menyimpannya pada variabel p, l, dan t.
4.Program memanggil fungsi hitungLuas(p, l) untuk menghitung luas persegi panjang.
5.Fungsi mengembalikan nilai luas, lalu program menampilkannya.
6.Program memanggil fungsi hitungVolume(t, p, l).
7.Fungsi ini memanggil hitungLuas(p, l) untuk mendapatkan luas alas, kemudian menghitung volume dan mengembalikannya.
8.Program menampilkan hasil volume balok.
9.Program selesai.

2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.
  Jawab=
1.Program membaca input:
p = 4
l = 3
t = 5
2.Program memanggil hitungLuas(p, l) → 4 * 3 = 12.
Nilai 12 dikembalikan dan ditampilkan.
3.Program memanggil hitungVolume(t, p, l)
Di dalamnya terjadi:
panggil lagi hitungLuas(p, l) → 12
volume = luas × tinggi = 12 × 5 = 60
4.Program menampilkan volume 60.

3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!
  Jawab= commit pertanyaan 3 percobaan 5
1.Program mulai dari main.
2.Jumlah(1,1) dipanggil → menghasilkan 2.
3.Nilai 2 disimpan di variabel temp.
4.TampilJumlah(temp, 5) dipanggil → berarti TampilJumlah(2,5).
5.Di dalam TampilJumlah:
  -Fungsi memanggil Jumlah(2,5) → hasilnya 7.
  -Lalu memanggil TampilHinggaKei(7).
6.TampilHinggaKei menampilkan angka:
1 2 3 4 5 6 7
menjadi:
1234567

4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!
  Jawab= Fungsi harus menggunakan parameter ketika fungsi membutuhkan data dari luar supaya bisa bekerja, misalnya menghitung luas membutuhkan panjang dan lebar. Fungsi tidak perlu parameter jika semua data sudah tersedia di dalam fungsi atau fungsi hanya melakukan aksi seperti mencetak teks.
Fungsi harus memiliki nilai kembalian (return value) jika fungsi menghasilkan hasil perhitungan yang perlu digunakan kembali oleh bagian program lain, seperti hitungLuas yang mengembalikan nilai luas. Fungsi tidak perlu nilai kembalian jika hanya menjalankan perintah tanpa memberi hasil, misalnya fungsi main atau fungsi yang hanya menampilkan output ke layar.

5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5.
  Jawab= Fungsi sebaiknya menggunakan parameter ketika perhitungannya membutuhkan nilai yang diberikan dari luar fungsi. Pada Percobaan 5, fungsi hitungLuas(pjg, lb) dan hitungVolume(tinggi, pjg, lb) menggunakan parameter karena panjang, lebar, dan tinggi harus diinput pengguna dan nilainya dapat berubah-ubah.
Fungsi boleh tanpa parameter jika semua data yang diperlukan sudah tersedia di dalam fungsi tersebut atau fungsinya tidak memerlukan data dari luar. Contohnya fungsi main, yang tidak membutuhkan parameter tambahan karena tugasnya hanya mengatur alur program.

6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitung Volume.
  Jawab= Fungsi sebaiknya memiliki nilai kembalian (return value) jika fungsi tersebut menghasilkan suatu perhitungan atau data yang perlu digunakan kembali oleh program. Pada Percobaan 5, hitungLuas dan hitungVolume menggunakan return karena hasil perhitungan luas dan volume akan dipakai lagi untuk ditampilkan.
Fungsi tidak perlu memiliki nilai kembalian jika tugasnya hanya menjalankan perintah tanpa menghasilkan nilai yang harus dikirim kembali. Contohnya fungsi main, yang hanya mengatur alur program dan menampilkan output, sehingga tidak membutuhkan return untuk mengembalikan nilai.
