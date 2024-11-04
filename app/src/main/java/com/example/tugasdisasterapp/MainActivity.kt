package com.example.tugasdisasterapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var movieAdapter: MovieAdapter
    private val movieList = mutableListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        // Mengatur GridLayoutManager dengan 2 kolom untuk tampilan grid
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        // Memuat daftar film
        loadMovies()

        // Mengatur adapter untuk RecyclerView
        movieAdapter = MovieAdapter(this, movieList)
        recyclerView.adapter = movieAdapter
    }

    private fun loadMovies() {
        // Menambahkan 6 data film sebagai contoh
        movieList.add(Movie("Venom: The Last Dance", "1j 48m", "R13+", "url_to_image", "Eddie Brock (Tom Hardy) masih sering dibuat repot meski sudah lama menjadi inang Venom. Dia tak hanya berusaha menyeimbangkan hidup antara menjadi manusia biasa dengan manusia super, tetapi juga beradaptasi supaya dapat harmonis dengan alien tersebut.\n" +
                "\n" + "Kehidupan itu membuat Eddie Brock sering berhadapan dengan musuh berbahaya. Namun, berbagai ancaman itu bisa diatasi karena kekuatan super yang muncul setiap Venom menguasai tubuhnya.\n" +
                "\n" + "Hingga suatu hari, masalah baru muncul saat makhluk-makhluk lain yang menyerupai Venom muncul ke Bumi. Ia kemudian menjadi target kejaran hingga harus melarikan diri.\n" +
                "\n" + "Venom bersama Eddie lalu kabur ke berbagai tempat. Mereka bahkan sempat menempel di pesawat yang sedang terbang di udara.\n"))
        movieList.add(Movie("DOSA MUSYRIK", "1j 32m", "D17+", "url_to_image", "Film ini menggambarkan akibat mengerikan dari perbuatan syirik, menunjukkan bagaimana keputusasaan bisa membawa seseorang terjerumus ke dalam situasi berbahaya. Pesan moral yang disampaikan adalah pentingnya tetap waspada dalam menghadapi cobaan hidup dan menghindari keyakinan yang menyimpang dari nilai-nilai agama."))
        movieList.add(Movie("Catatan Si Boy", "1j 30m", "R13+", "url_to_image", "Catatan Si Boy menceritakan kehidupan anak muda Jakarta bernama Boy dengan segala tantangan yang dia hadapi mulai dari percintaan, persahabatan, keluarga, dan cita-cita.\n" +
                "\n" + "Boy merupakan laki-laki kaya yang memiliki kekasih bernama Nuke yang harus melanjutkan pendidikannya di luar negeri.\n" +
                "\n" + "Ketika menjalankan hubungan jarak jauh itu, Boy justru terlibat asmara dengan perempuan lain bernama Vera.\n" +
                "\n" + "Boy pun harus berhadapan dengan kisah cinta segitiga yang pelik yang menjadi sorotan dalam film ini"))
        movieList.add(Movie("172 Days", "2j 5m", "R13+", "", "Melalui perjalanan hijrahnya itu lah Nadzira Shafa kemudian jadi banyak belajar tentang ilmu agama dan sering menghadiri majelis pengajian. Pada suatu hari, saat Nadzira mendatangi salah satu tempat pengajian, dia bertemu dengan seorang ustadz bernama Ameer Azzikra.\n" +
                "\n" + "Pertemuan keduanya berujung membuat Nadzira dan Ameer memutuskan untuk menjalani ta'aruf. Akhirnya keduanya melangsungkan pernikahan dan Ameer yang memiliki ilmu agama yang tinggi menuntun sang istri yang sudah berniat hijrah supaya bisa istiqomah di jalan Allah SWT.\n" +
                "\n" + "Setelah keduanya menikah, rumah tangga mereka berlangsung harmonis selama 172 hari. Hingga tiba pada momen Ameer menderita sakit dan mengharuskan Nadzira untuk merawat suaminya yang sedang terkapar lemah.\n" +
                "\n" + "Nadzira begitu setia menemani suaminya selama dia tidak berdaya. Sampai akhirnya Ameer dinyatakan meninggal dunia oleh dokter yang menangani penyakitnya itu.\n"))
        movieList.add(Movie("Surat Cinta Untuk Starla", "1j 20m", "D17+", "url_to_image", "Hema adalah seorang cowok yang terobsesi dengan cintanya pada alam yang memiliki keunikan membuat surat cinta untuk alam. Dengan dibantu mesin tik tuanya peninggalan sang kakek mantan jurnalis, Hema membuat mural yang menunjukkan betapa cintanya Reza pada alam ini. Alam adalah satu satunya cinta yang Hema kenal.\n" +
                "\n" + "Hingga suatu saat Hema mengenal Starla. Gadis cantik dan mandiri yang selama 6 jam telah berhasil membuatnya jatuh cinta. Untuk pertama kalinya Hema menyadari ada surat cinta yang lebih indah daripada surat cinta untuk alam yaitu surat cinta untuk Starla.\n" +
                "\n" + "Namun pada saat Hema dan Starla semakin dekat, tiba tiba sikap Starla berubah. Starla marah dan menjauhi Hema bahkan menyuruh Hema melupakan 6 jam kisah mereka yang menjadi viral di sosial media bahkan disiarkan di radio oleh Athena (Salshabilla Adriani), sahabat Hema.\n" +
                "\n" + "Hingga suatu ketika Hema baru mengetahui penyebab perubahan sikap Starla padanya yang berhubungan dengan sebuah rahasia masa lalu keluarga Hema."))
        movieList.add(Movie("Imperfect", "1j 40m", "R13+", "url_to_image", "Film Imperfect: Karier, Cinta & Timbangan mengisahkan Rara, manajer riset yang berantakan dan kelebihan berat badan, hidup di dunia yang mementingkan penampilan. Dia mengatur dunianya dengan hubungan dekat dengan pacarnya, Dika dan ibunya, juga sahabatnya, Fey.\n" +
                "\n" + "Semuanya mulai berubah ketika dia dipromosikan menjadi manajer pemasaran, tetapi dinilai berdasarkan penampilannya dan dianggap “tidak rapi”. Kemudian dia memutuskan untuk menantang bosnya bahwa dia harus diberi posisi itu jika dia berhasil menurunkan berat badan dan mengubah penampilannya."))
    }
}
