var Masking = function () {

    return {
        
        //Masking
        initMasking: function () {
			//Ids
            $("#data").mask('99/99/9999', {placeholder:'_'});
			$("#telefone").mask('(99) 9999-9999', {placeholder:'_'});
			$("#telefone2").mask('(99) 9999-9999', {placeholder:'_'});
			$("#celular").mask('(99) 9999?9-9999', {placeholder:'_'});
			$("#cep").mask('99999-999', {placeholder:'_'});
			$("#cpf").mask('999.999.999-99', {placeholder:'_'});
			$("#cnpj").mask('99.999.999/9999-99', {placeholder:'_'});
			$("#card").mask('9999-9999-9999-9999', {placeholder:'_'});
			$("#serial").mask('***-***-***-***-***-***', {placeholder:'_'});
			$("#tax").mask('99-9999999', {placeholder:'_'});
 
			//Classes
            $(".data").mask('99/99/9999', {placeholder:'_'});
            $(".telefone").mask('(99) 9999-9999', {placeholder:'_'});
            $(".telefone2").mask('(99) 9999-9999', {placeholder:'_'});
            $(".celular").mask('(99) 9999?9-9999', {placeholder:'_'});
            $(".cep").mask('99999-999', {placeholder:'_'});
            $(".cpf").mask('999.999.999-99', {placeholder:'_'});
            $(".cnpj").mask('99.999.999/9999-99', {placeholder:'_'});
            $(".card").mask('9999-9999-9999-9999', {placeholder:'_'});
            $(".serial").mask('***-***-***-***-***-***', {placeholder:'_'});
            $(".tax").mask('99-9999999', {placeholder:'_'});
        }

    };
    
}();