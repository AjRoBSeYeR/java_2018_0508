<%@ include file="includes/header.jsp" %>
<%@ include file="includes/navbar.jsp" %>
    

        
        <main role="main" class="container">
		
		<p class="text-danger">${param.msg }</p>
            <div class="row justify-content-center">
                <h1 class="col col-md-6"><i class="fas fa-user"></i> Login</h1>
            </div>
                    
            <div class="row justify-content-center">
                <small id="login-small" class="col col-md-6">Los campos con * son obligatorios</small>
            </div>

            <form id="login-form">
			
                <div class="form-row justify-content-center">
                            
                    <div class="col col-md-6">
                        
                        <div class="form-group">
                            <label for="correo" class="required">Email</label>
                            <input type="email" class="form-control" id="correo" autofocus required placeholder="Ej: paco@gmail.com" />
                        </div>
                                    
                        <div class="form-group">
                            <label for="pass" class="required">Contraseņa</label>
                            <input type="password" class="form-control" id="pass" minlength="8" maxlength="20" required placeholder="Contraseņa del usuario (8 a 20 caracteres)" />
                        </div>
                                    
                        <button type="submit" class="btn btn-outline-primary btn-block">Acceder</button>
                                    
                    </div>
                                    
                </div>
                            
            </form>

        </main>
        

<%@ include file="includes/footer.jsp" %>