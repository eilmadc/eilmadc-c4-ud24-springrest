/**
 * C4-UD24-Spring Resftul
 */
package com.crud.h2.dto;

/**
 * @author elena-01
 *
 */
public enum Jobs {
	ADMINISTRADOR {
		public double pay() {
			return 42000;
		}
	},
	GERENTE {
		public double pay() {
			return 39000;
		}
	},
	DIRECTOR {
		public double pay() {
			return 38500;
		}
	},
	AUXILIAR_MANTENIMIENTO {
		public double pay() {
			return 26000;
		}
	},
	AUXILIAR_ADMINISTRATIVO {
		public double pay() {
			return 25700;
		}
	};
	
	/*
	 * public final String label;
	 * 
	 * private Element(String label) { this.label = label; }
	 */
	public abstract double pay();

}
