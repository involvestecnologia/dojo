const map = {
  ABC: '2',
  DEF: '3',
  GHI: '4',
  JKL: '5',
  MNO: '6',
  PQRS: '7',
  TUV: '8',
  WXYZ: '9',
  ' ': '0',
};

const convertChar = (char) => {
  let output = '';
  Object.keys(map).forEach((key) => {
    const idx = key.indexOf(char);
    if (idx >= 0) {
      for (let i = 0; i < idx + 1; i++) {
        output += map[key];
      }
    }
  });
  return output;
};

module.exports = {
  convert: (word => word.split('').map(convertChar).reduce((prev, curr) => {
    if (prev.length) {
      if (prev[prev.length - 1].charAt(0) === curr.charAt(0)) {
        prev.push('_');
      }
      prev.push(curr);
      return prev;
    }
    prev.push(curr);
    return prev;
  }, []).join('')),
};
