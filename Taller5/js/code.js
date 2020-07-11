function max_25(element) {

  let text = element.value;
  if (text.length == 0 ) {
      element.setCustomValidity('Rellene este campo')

  } else {
      element.setCustomValidity('Maximo 25 caracteres');

  }
}

function pass(element) {

  let text = element.value;
  if (text.length < 15 || text.length > 25 ) {
      element.setCustomValidity('La longitud debe ser de minimo 15 caracteres y maximo 20 caracteres')

  }
}

function confirm(element) {

  let pass = document.getElementById('password')
  if (element.value == pass.value){
      element.pattern =  "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{12,25}$";
      element.setCustomValidity('');
  } else {
      element.pattern =  '';
      element.setCustomValidity('La contraseñas deben coincidir');
  }
  console.log(element.pattern );
  console.log(element.checkValidity());

}

function pass(element) {

  let text = element.value;
  if (text.length >120 ) {
      element.setCustomValidity('Longitud Maxima 120 Caracteres')

  }
}
