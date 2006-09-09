//
// Copyright (C) 2006 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
// 
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
// directory tree for the complete NOSA document.
// 
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//
package tesis.extensiones;

/**
 * Clase abstracta utilizada para definir Autómatas de verificaci�n
 * 
 */
public abstract class AutomataVerificacion {
	protected int estadoActual;
	protected boolean blnEstadoFinal = false;
	
	public AutomataVerificacion (){
		estadoActual = 0;
	}
	
	public final void irAEstado(int est){
		System.out.println("Autómata BACKTRACK al estado " + est);
		estadoActual = est;
	}

	public final boolean estadoFinal() {
		return blnEstadoFinal;
	}

	public abstract void consumir (Evento e);

	public final int getEstadoActual() {
		return estadoActual;
	}
}
