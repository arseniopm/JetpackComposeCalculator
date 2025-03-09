package ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun KalkulatorScreen() {
    var input1 by remember { mutableStateOf("") }
    var input2 by remember { mutableStateOf("") }
    var hasil by remember { mutableStateOf(0.0) }

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = input1,
            onValueChange = { input1 = it },
            label = { Text("Angka 1") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = input2,
            onValueChange = { input2 = it },
            label = { Text("Angka 2") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            val angka1 = input1.toDoubleOrNull() ?: 0.0
            val angka2 = input2.toDoubleOrNull() ?: 0.0
            hasil = angka1 + angka2
        }, modifier = Modifier.fillMaxWidth()) {
            Text("Tambah")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Hasil: $hasil",
            style = MaterialTheme.typography.headlineSmall
        )

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewKalkulatorScreen() {
    KalkulatorScreen()
}
