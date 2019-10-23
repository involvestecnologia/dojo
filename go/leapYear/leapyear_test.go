package leapyear_test

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func Test_NaoEBissextoSeMenorQue1582(t *testing.T) {
	assert.False(t, AnoBissexto(1581))
}

func Test_AnoEBissextoSeDivisivelPor400(t *testing.T) {
	assert.True(t, AnoBissexto(1600))
}

func Test_AnoNaoEBissextoSeDivisivelPor100ENaoPor400(t *testing.T) {
	assert.False(t, AnoBissexto(1800))
}

func Test_AnoEBissextoSeDivisivelPor4(t *testing.T) {
	assert.True(t, AnoBissexto(1996))
}

func Test_AnoNaoEhBissextoSeNenhumaDasAnteriores(t *testing.T) {
	assert.False(t, AnoBissexto(1994))
}
