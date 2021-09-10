/*
 *	Form Validator v1.0
 *
 *	Copyright (c) 2018 Contratasite
 *	http://www.contratasite.com.br
 *
 */

var rules;

var formValidation = {
    init: function (rules) {
        var rules = JSON.parse(rules);
        validateAll();
        $(document.body).on('keyup','input', function() {
            $(this).parent('.form-group').removeClass('has-error');
            $(this).parent('.form-group').find('.help-block').removeClass('with-errors').html('');
        });
        $(document.body).on('keyup','input[type=email]', function() {
            var value = $(this).val();
            value = value.replace(/ /g, '').toLowerCase();
            $(this).val(value)
        });
        $(document.body).on('blur','input', function() {
            var form = this.form;
            validateInputs(form, this.name);
        });
        $(document.body).on('blur','select', function() {
            var form = this.form;
            validateInputs(form, this.name);
        });
        $(document.body).on('blur','textarea', function() {
            var form = this.form;
            validateInputs(form, this.name);
        });
        $('.form-group').removeClass('has-error');
        $('.help-block').removeClass('with-errors').html('');
        $("form").submit(function(event) {
            var form = this.form;
            var hasError = validateInputs(form);
            if(hasError){
                event.preventDefault();
            }
        });
        $("form").submit(function(event) {
            var form = this.form;
            var hasError = validateInputs(form);
            if(hasError){
                return false;
            }
        });
        function validateAll(){
            $.each(rules, function (key, value) {
                var form = $('#'+key+'');

                $.each($(form).find('input, select, textarea'), function () {
                    validateInputs(form, $(this));
                });
            });
        }
        function validateInputs(form, inputValidate) {
            function getMessage(messageType, message) {

                switch (messageType) {
                    case 'min':
                        return 'O campo deve ter no mínimo de ' + message + ' caracteres.';
                        break;
                    case 'max':
                        return 'O campo deve ter no máximo de ' + message + ' caracteres.';
                        break;
                    case 'required':
                        return 'Campo obrigatório.';
                        break;
                    case 'email':
                        return 'E-mail inválido.';
                        break;
                    case 'float':
                        return 'O campo deve conter número decinal.';
                        break;
                    case 'int':
                        return 'O campo deve conter número inteiro.';
                        break;
                    case 'date':
                        return 'Data inválida.';
                        break;
                    case 'money':
                        return 'O campo deve ter o valor em dinheiro.';
                        break;
                    case 'url':
                        return 'Url inválida.';
                        break;
                }
            }

            var hasError = false;

            $.each($(form).find('input, select, textarea'), function () {
                var input = this;
                $.each(rules, function (key, value) {
                    if($(form).hasClass('' + key + '') || form.id == key){
                        $.each(value, function (key, value) {
                            if (input.name == key) {
                                if (value.indexOf('|') !== -1) {
                                    var splitedRules = value.split('|');
                                    $.each(splitedRules, function (key, value) {
                                        if (value.indexOf(':') !== -1) {
                                            var splitedRule = value.split(':');
                                            switch (splitedRule[0]) {
                                                case 'min':
                                                    if (input.value.length > 0) {
                                                        if (input.value.length < splitedRule[1]) {
                                                            if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('min', splitedRule[1]));
                                                                hasError = true;
                                                            } else if (inputValidate == null) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('min', splitedRule[1]));
                                                                hasError = true;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 'max':
                                                    if (input.value.length > 0) {
                                                        if (input.value.length > splitedRule[1]) {
                                                            if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('max', splitedRule[1]));
                                                                hasError = true;
                                                            } else if (inputValidate == null) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('max', splitedRule[1]));
                                                                hasError = true;
                                                            }
                                                        }
                                                    }
                                                    break;
                                            }
                                        } else {
                                            switch (value) {
                                                case 'required':
                                                    if (input.value.length == 0) {
                                                        if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                            $(input).parent('.form-group').addClass('has-error');
                                                            $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('required'));
                                                            hasError = true;
                                                        } else if (inputValidate == null) {
                                                            $(input).parent('.form-group').addClass('has-error');
                                                            $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('required'));
                                                            hasError = true;
                                                        }
                                                    }
                                                    break;
                                                case 'email':
                                                    if (input.value.length > 0) {
                                                        if (!isEmail(input.value)) {
                                                            if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('email'));
                                                                hasError = true;
                                                            } else if (inputValidate == null) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('email'));
                                                                hasError = true;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 'float':
                                                    if (input.value.length > 0) {
                                                        if (!isFloat(input.value)) {
                                                            if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('float'));
                                                                hasError = true;
                                                            } else if (inputValidate == null) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('float'));
                                                                hasError = true;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 'int':
                                                    if (input.value.length > 0) {
                                                        if (!isInt(input.value)) {
                                                            if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('int'));
                                                                hasError = true;
                                                            } else if (inputValidate == null) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('int'));
                                                                hasError = true;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 'date':
                                                    if (input.value.length > 0) {
                                                        if (!isDate(input.value)) {
                                                            if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('date'));
                                                                hasError = true;
                                                            } else if (inputValidate == null) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('date'));
                                                                hasError = true;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 'money':
                                                    if (input.value.length > 0) {
                                                        if (!isMoney(input.value)) {
                                                            if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('money'));
                                                                hasError = true;
                                                            } else if (inputValidate == null) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('money'));
                                                                hasError = true;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 'url':
                                                    if (input.value.length > 0) {
                                                        if (!isUrl(input.value)) {
                                                            if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('url'));
                                                                hasError = true;
                                                            } else if (inputValidate == null) {
                                                                $(input).parent('.form-group').addClass('has-error');
                                                                $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('url'));
                                                                hasError = true;
                                                            }
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else if (value.indexOf(':') !== -1) {
                                    var splitedRule = value.split(':');
                                    switch (splitedRule[0]) {
                                        case 'min':
                                            if (input.value.length > 0) {
                                                if (input.value.length < splitedRule[1]) {
                                                    if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('min', splitedRule[1]));
                                                        hasError = true;
                                                    } else if (inputValidate == null) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('min', splitedRule[1]));
                                                        hasError = true;
                                                    }
                                                }
                                            }
                                            break;
                                        case 'max':
                                            if (input.value.length > 0) {
                                                if (input.value.length > splitedRule[1]) {
                                                    if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('max', splitedRule[1]));
                                                        hasError = true;
                                                    } else if (inputValidate == null) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('min', splitedRule[1]));
                                                        hasError = true;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    switch (value) {
                                        case 'required':
                                            if (input.value.length == 0) {
                                                if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                    $(input).parent('.form-group').addClass('has-error');
                                                    $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('required'));
                                                    hasError = true;
                                                } else if (inputValidate == null) {
                                                    $(input).parent('.form-group').addClass('has-error');
                                                    $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('required'));
                                                    hasError = true;
                                                }
                                            }
                                            break;
                                        case 'email':
                                            if (input.value.length > 0) {
                                                if (!isEmail(input.value)) {
                                                    if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('email'));
                                                        hasError = true;
                                                    } else if (inputValidate == null) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('email'));
                                                        hasError = true;
                                                    }
                                                }
                                            }
                                            break;
                                        case 'float':
                                            if (input.value.length > 0) {
                                                if (!isFloat(input.value)) {
                                                    if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('float'));
                                                        hasError = true;
                                                    } else if (inputValidate == null) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('float'));
                                                        hasError = true;
                                                    }
                                                }
                                            }
                                            break;
                                        case 'int':
                                            if (input.value.length > 0) {
                                                if (!isInt(input.value)) {
                                                    if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('int'));
                                                        hasError = true;
                                                    } else if (inputValidate == null) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('int'));
                                                        hasError = true;
                                                    }
                                                }
                                            }
                                            break;
                                        case 'date':
                                            if (input.value.length > 0) {
                                                if (!isDate(input.value)) {
                                                    if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('date'));
                                                        hasError = true;
                                                    } else if (inputValidate == null) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('date'));
                                                        hasError = true;
                                                    }
                                                }
                                            }
                                            break;
                                        case 'money':
                                            if (input.value.length > 0) {
                                                if (!isMoney(input.value)) {
                                                    if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('money'));
                                                        hasError = true;
                                                    } else if (inputValidate == null) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('money'));
                                                        hasError = true;
                                                    }
                                                }
                                            }
                                            break;
                                        case 'url':
                                            if (input.value.length > 0) {
                                                if (!isUrl(input.value)) {
                                                    if (inputValidate != 'undefined' && inputValidate == input.name) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('url'));
                                                        hasError = true;
                                                    } else if (inputValidate == null) {
                                                        $(input).parent('.form-group').addClass('has-error');
                                                        $(input).parent('.form-group').find('.help-block').addClass('with-errors').html(getMessage('url'));
                                                        hasError = true;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                            }
                        });
                    }
                });
            });

            function isEmail(email) {
                var re = /\S+@\S+\.\S+/;
                return re.test(email);
            }

            function isInt(n) {
                return Number(n).toString() === n.toString() && n % 1 === 0;
            }

            function isFloat(n) {
                return Number(n).toString() === n.toString() && n % 1 !== 0;
            }

            function isDate(date) {
                var temp = date.split('/');
                var d = new Date(temp[2] + '/' + temp[1] + '/' + temp[0]);
                return (d && (d.getMonth() + 1) == temp[1] && d.getDate() == Number(temp[0]) && d.getFullYear() == Number(temp[2]));
            }

            function isMoney(numStr) {
                var regex = /\d{1,3}(?:\.\d{3})*?,\d{2}/;
                if (regex.test(numStr))
                    return true;
                else
                    return false;
            }

            function isUrl(string) {
                var regex = /(http|https):\/\/(\w+:{0,1}\w*@)?(\S+)(:[0-9]+)?(\/|\/([\w#!:.?+=&%@!\-\/]))?/;
                if (regex.test(string))
                    return true;
                else
                    return false;
            }

            if (hasError) {
                return true;
            }
        }
    }
};
