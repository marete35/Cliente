<div class="modal fade modal-login" id="modal-re-login-container" role="dialog">
   <div class="modal-small">
      <!-- Modal content-->
      <div class="modal-content">
         <div class="panel panel-primary">
         <button type="button" class="close" data-dismiss="modal">X</button>
<!--             <h4 id="modal-title" class="modal-title text-center">Login</h4> -->
         </div>                    
            <p id="modal-text" class="text-center"></p>
				<div class="panel-body">
					<div class="page-header">
						<h3>Su sesión ha finalizado! vuelva a introducir sus credenciales por favor!</h3>
					</div>
					<form id="form-login2" novalidate="novalidate">
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<label>Usuario</label> <input id="user-re-login" class="form-control" value="" autofocus tabindex="1" type="text" name="nameUser">
								</div>
								<div class="form-group">
									<label>Contraseña</label> <input id="password-re-login" class="form-control" value="" tabindex="2" type="password" name="userPassword">
								</div>
							</div>
						</div>						
						<div class="pull-right">					
							<button type="button" onclick="handleReLogin();" class="btn btn-primary btn-md" id="btn-accept">
								<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>	Aceptar											
							</button>					
						</div>
<!-- 						<div class="accept-form">						 -->
<!-- 							<a class="txt-link-general">¿Olvidó su contraseña?</a> -->
<!-- 						</div> -->
					</form>
				</div>
			</div>
         </div>
<!--          <div class="nav navBorder"> -->
<!--             <div class="navbar-right"> -->
<!--                <button type="button" class="btn btn-primary btn-md" data-dismiss="modal">Cerrar</button> -->
<!--             </div> -->
<!--          </div> -->
      </div>
