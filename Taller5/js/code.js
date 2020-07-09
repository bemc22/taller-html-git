function max_25(element) {

  let text = element.value;
  if (text.length == 0 ) {
      element.setCustomValidity('Rellene este campo')

  } else {
      element.setCustomValidity('Maximo 25 caracteres');

  }
}
