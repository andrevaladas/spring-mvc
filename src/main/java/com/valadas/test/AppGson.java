/**
 * 
 */
package com.valadas.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

/**
 * @author andre.silva
 *
 */
public class AppGson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Pessoa pessoa = new AppGson().new Pessoa();
		pessoa.setId(Long.valueOf(1));
		pessoa.setNome("André");
		pessoa.setSobrenome("Valadas");
		pessoa.setDataCadastro(new Date());

		final String json = new Gson().toJson(pessoa);
		System.out.println(json);

		final Pessoa fromJson = new Gson().fromJson(json, Pessoa.class);
		System.out.println(fromJson);

		final Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("id", "321321");
		final String jsonMap = new Gson().toJson(hashMap);
		System.out.println(jsonMap);
		
		
		final Map<String, String> fromJsonMap = new Gson().fromJson(jsonMap, Map.class);
		System.out.println(fromJsonMap);
	}

	class Pessoa {
		Long id;
		String nome;
		String sobrenome;
		Date dataCadastro;

		@Override
		public String toString() {
			return "Pessoa [id=" + id + ", nome=" + nome + ", sobrenome="
					+ sobrenome + ", dataCadastro=" + dataCadastro + "]";
		}

		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSobrenome() {
			return sobrenome;
		}
		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		public Date getDataCadastro() {
			return dataCadastro;
		}
		public void setDataCadastro(Date dataCadastro) {
			this.dataCadastro = dataCadastro;
		}
	}
}
