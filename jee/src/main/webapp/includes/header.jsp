<h2>Saludar</h2>
<form action="saludoPost">
	<input name="nombre" type="text" placeholder="Escribe aqu� tu nombre">
	<p class="text-danger">${msg}</p>
	<input type="submit" value="Enviar">
</form>
<hr>
<h2>Calcular</h2>
<form action="calcular">
	<input name="num1" type="text" placeholder="Escribe aqu� un n�mero">
	<br> <input name="num2" type="text"
		placeholder="Escribe aqu� un n�mero" required> <br> <br>
	<input type="radio" name="operacion" value="+"> + <input
		type="radio" name="operacion" value="-"> - <input type="radio"
		name="operacion" value="*"> * <input type="radio"
		name="operacion" value="/"> / <br> <input type="submit"
		value="Enviar">
</form>
<br>
<p class="text-danger">${resultado}</p>