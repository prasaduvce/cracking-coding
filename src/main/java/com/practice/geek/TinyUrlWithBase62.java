package com.practice.geek;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TinyUrlWithBase62 {
	public static void main(String[] args) {

		SecureRandom secureRandom = new SecureRandom();
	//	secureRandom.generateSeed(7);
		//secureRandom.

		List<String> tinyUrls = new ArrayList<>();
		Map<String, String> shortUrlKeyValueMap = new HashMap<>();
		tinyUrls.add("https://www.educative.io/collection/page/5668639101419520/5649050225344512/5668600916475904");
		tinyUrls.add("https://www.educative.io/collection/page/5668639101419520/5649050225344512/5668600916475905");
		tinyUrls.add("https://www.educative.io/collection/page/5668639101419520/5649050225344512/5668600916475906");
		tinyUrls.add("https://www.educative.io/collection/page/5668639101419520/5649050225344512/5668600916475907");
		tinyUrls.add("https");

		tinyUrls.forEach(url  -> {


		});

		List<TinyUrlModel> shortUrls = tinyUrls.stream().map(url -> {
			int secureRandomInt = secureRandom.nextInt(9999999);
			System.out.println("secureRandomInt ==> " + secureRandomInt);
			;
			System.out.println("Encoded Secure random Int ==> " + encodeToBase62(secureRandomInt));
			;

			TinyUrlModel tinyUrlModel = new TinyUrlModel(secureRandomInt, url, encodeToBase62(secureRandomInt));
			return tinyUrlModel;
		}).collect(Collectors.toList());

		System.out.println("shortUrls ==> "+shortUrls);


	}

	private static String encodeToBase62(int input) {
		String base62Chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String encodedStr = "";
		while (input > 0) {
			int modinput = input % 62;
			encodedStr = base62Chars.charAt(modinput) + encodedStr;
			input = input / 10;
		}
		return encodedStr;
	}
}

class TinyUrlModel {
	private int number;
	private String longUrl;
	private String shortUrl;

	public TinyUrlModel(int number, String longUrl, String shortUrl) {
		this.number = number;
		this.longUrl = longUrl;
		this.shortUrl = shortUrl;
	}

	public int getNumber() {
		return number;
	}

	public String getLongUrl() {
		return longUrl;
	}

	public String getShortUrl() {
		return shortUrl;
	}

	@Override
	public String toString() {
		return "TinyUrlModel{" +
			   "number=" + number +
			   ", longUrl='" + longUrl + '\'' +
			   ", shortUrl='" + shortUrl + '\'' +
			   '}';
	}
}
