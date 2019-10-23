package leapyear

// AnoBissexto verifica se um ano é bissexto
func AnoBissexto(ano uint) bool {
	if ehMenorQue1582(ano) {
		return false
	}

	divisivel := ehDivisivelPor(ano, 400)
	if divisivel {
		return true
	}

	if !divisivel && ehDivisivelPor(ano, 100) {
		return false
	}

	if ehDivisivelPor(ano, 4) {
		return true
	}

	return false
}

func ehMenorQue1582(ano uint) bool {
	return ano < 1582
}

func ehDivisivelPor(ano uint, valor uint) bool {
	return ano%valor == 0
}
