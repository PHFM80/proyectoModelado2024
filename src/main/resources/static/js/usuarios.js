// Call the dataTables jQuery plugin
$(document).ready(function() {
  alert("funcionando el archivo js");

  cargarUsuarios();

  $('#usuarios').DataTable();
});

async function cargarUsuarios() {
  const request = await fetch('api/usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  
  const usuarios = await request.json();
  let listadoHtml = '';

  for (let usuario of usuarios) {
    // Corregir el uso de comillas para que sea una cadena válida de HTML
    let botonEliminar = '<a href="#" class="btn btn-danger btn-circle"> <i class="fas fa-trash"></i> </a>';

    // Corregir el formato HTML de las filas de la tabla
    let usuarioHtml = `<tr>
      <td>${usuario.id}</td>
      <td>${usuario.nombre}</td>
      <td>${usuario.apellido}</td>
      <td>${usuario.email}</td>
      <td>${usuario.telefono}</td>
      <td>${botonEliminar}</td>
    </tr>`;
    
    listadoHtml += usuarioHtml;
  }
  
  document.querySelector('#usuarios tbody').outerHTML = listadoHtml;
}
