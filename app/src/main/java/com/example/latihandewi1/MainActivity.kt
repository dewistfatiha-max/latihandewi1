package com.example.dewi.negaradanbendera

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val BiruMuda = Color(0xFFE3F2FD)
private val BiruTua = Color(0xFF1565C0)
private val Oranye = Color(0xFFFF9800)
private val Putih = Color(0xFFFFFFFF)
private val Gelap = Color(0xFF2C2C2C)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                NegaraDanBenderaApp()
            }
        }
    }
}

@Composable
fun NegaraDanBenderaApp() {
    var halaman by remember { mutableStateOf("Negara") }

    Scaffold(
        containerColor = BiruMuda,
        bottomBar = {
            NavigationBar(
                containerColor = Putih
            ) {
                NavigationBarItem(
                    selected = halaman == "Negara",
                    onClick = { halaman = "Negara" },
                    icon = { Text("🌏", fontSize = 23.sp) },
                    label = { Text("Negara") }
                )
                NavigationBarItem(
                    selected = halaman == "Bendera",
                    onClick = { halaman = "Bendera" },
                    icon = { Text("🚩", fontSize = 23.sp) },
                    label = { Text("Bendera") }
                )
            }
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(20.dp)
        ) {
            when (halaman) {
                "Negara" -> HalamanNegara()
                "Bendera" -> HalamanBendera()
            }
        }
    }
}

@Composable
fun HalamanNegara() {
    Text(
        text = "🌏 Negara-Negara ASEAN",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        color = BiruTua
    )

    Spacer(modifier = Modifier.height(20.dp))

    Text(
        text = "Halo Dewi! Berikut 10 negara anggota ASEAN:",
        fontSize = 16.sp,
        color = Gelap
    )

    Spacer(modifier = Modifier.height(20.dp))

    val daftarNegara = listOf(
        "🇮🇩 Indonesia",
        "🇲🇾 Malaysia",
        "🇸🇬 Singapura",
        "🇹🇭 Thailand",
        "🇵🇭 Filipina",
        "🇻🇳 Vietnam",
        "🇧🇳 Brunei Darussalam",
        "🇱🇦 Laos",
        "🇲🇲 Myanmar",
        "🇰🇭 Kamboja"
    )

    daftarNegara.forEach { negara ->
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            shape = RoundedCornerShape(14.dp),
            colors = CardDefaults.cardColors(containerColor = Putih)
        ) {
            Text(
                text = negara,
                fontSize = 18.sp,
                modifier = Modifier.padding(16.dp),
                color = Gelap
            )
        }
    }

    Spacer(modifier = Modifier.height(24.dp))

    Text(
        text = "Pilih menu Bendera di bawah ya!",
        fontSize = 14.sp,
        color = BiruTua
    )
}

@Composable
fun HalamanBendera() {
    Text(
        text = "🚩 Bendera Negara ASEAN",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        color = Oranye
    )

    Spacer(modifier = Modifier.height(20.dp))

    Text(
        text = "Kenali bendera dari setiap negara, Dewi!",
        fontSize = 16.sp,
        color = Gelap
    )

    Spacer(modifier = Modifier.height(20.dp))

    val daftarBendera = listOf(
        "🇮🇩 Indonesia — Merah Putih",
        "🇲🇾 Malaysia — Jalur Gemilang",
        "🇸🇬 Singapura — Bulan Bintang",
        "🇹🇭 Thailand — Putih-Merah-Biru",
        "🇵🇭 Filipina — Biru-Kuning-Merah",
        "🇻🇳 Vietnam — Merah Bintang Kuning",
        "🇧🇳 Brunei — Kuning-Hitam-Putih",
        "🇱🇦 Laos — Merah-Biru-Bintang",
        "🇲🇲 Myanmar — Kuning-Hijau-Merah",
        "🇰🇭 Kamboja — Biru-Merah-Biru"
    )

    daftarBendera.forEach { bendera ->
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            shape = RoundedCornerShape(14.dp),
            colors = CardDefaults.cardColors(containerColor = Putih)
        ) {
            Text(
                text = bendera,
                fontSize = 17.sp,
                modifier = Modifier.padding(16.dp),
                color = Gelap
            )
        }
    }

    Spacer(modifier = Modifier.height(24.dp))

    Text(
        text = "Pilih menu Negara untuk kembali!",
        fontSize = 14.sp,
        color = Oranye
    )
}