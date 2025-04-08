package com.coding.codingtest

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer



fun main() {
    codingTest()
}

fun codingTest() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val st = StringTokenizer(br.readLine(), " ")

    var a = st.nextToken().toInt()
    var b = st.nextToken().toInt()

    bw.write("${a + b}\n")
    bw.write("${a - b}\n")
    bw.write("${a * b}\n")
    bw.write("${a / b}\n")
    bw.write("${a % b}\n")

    bw.flush()
}