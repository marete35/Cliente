<%--
	Author(s): mgalarza@learsoft.com.ar
	Description: Representa un modal que muestra un mensaje de texto al usuario.
 --%>

<div class="modal fade modal-generic" id="modal-container" role="dialog">
   <div class="modal-dialog">
      <!-- Modal content-->
      <div class="modal-content">
         <div class="panel panel-primary">
            <button type="button" class="close" data-dismiss="modal">X</button>
            <h4 id="modal-title" class="modal-title text-center">Modal Header</h4>
         </div>
         <div class="panel-body">
            <p id="modal-text" class="text-center"></p>
         </div>
         <div class="nav navBorder">
            <div class="navbar-right">
               <button type="button" class="btn btn-primary btn-md" data-dismiss="modal">Cerrar</button>
            </div>
         </div>
      </div>
   </div>
</div>
