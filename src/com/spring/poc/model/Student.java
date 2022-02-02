package com.spring.poc.model;

	public class Student {
		
		private String name;
		private int id;
		private double score;
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the score
		 */
		public double getScore() {
			return score;
		}
		/**
		 * @param d the score to set
		 */
		public void setScore(double d) {
			this.score = d;
		}
		
	}

