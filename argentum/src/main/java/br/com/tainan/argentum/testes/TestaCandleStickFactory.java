package br.com.tainan.argentum.testes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.tainan.argentum.modelo.Candlestick;
import br.com.tainan.argentum.modelo.CandlestickFactory;
import br.com.tainan.argentum.modelo.Negociacao;

public class TestaCandleStickFactory {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance();
		Negociacao negociacao1 = new Negociacao(40.5, 100, hoje);
		Negociacao negociacao2 = new Negociacao(45.0, 100, hoje);
		Negociacao negociacao3 = new Negociacao(39.8, 100, hoje);
		Negociacao negociacao4 = new Negociacao(42.3, 100, hoje);
		
		List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2,
		negociacao3, negociacao4);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick candle = fabrica.constroiCandleParaData(
		hoje, negociacoes);
		
		System.out.println(candle);
	}
}
