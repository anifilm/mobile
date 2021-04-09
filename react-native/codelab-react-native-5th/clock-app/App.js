import * as React from 'react';
import { SafeAreaView, Text, View, StyleSheet } from 'react-native';
import Constants from 'expo-constants';
import moment from 'moment';

import styled from 'styled-components/native';
import Container from './components/Container';
import Row from './components/Row';

moment.locale('ko');

const Label = styled.Text`
  font-size: 20px;
  margin-top: 40px;
`;

const Label2 = styled.Text`
  font-size: 60px;
  font-weight: bold;
`;

const Label3 = styled.Text`
  font-size: 12px;
  margin-left: 10px;
`;

export default function App() {
  const [now, setNow] = React.useState(moment());
  // 1. 이 컴포넌트가 렌더링 된 후 처음으로 화면에 표시될 때
  // 2. 주시하는 대상에 변화가 일어났을 때
  React.useEffect(() => {
    setInterval(() => {
      setNow(moment());
    }, 1000);
  }, []);
  return (
    <Container>
      <Row>
        <Label>{ now.format('a ') }</Label>
        <Label2>{ now.format('HH') }</Label2>
        <Label2>{ parseInt(now.format('s'), 10) % 2 === 1 ? ':' : ' ' }</Label2>
        <Label2>{ now.format('mm') }</Label2>
      </Row>
      <Row>
        <Label3>{ now.format('MMM Do (dd)') }</Label3>
      </Row>
    </Container>
  );
}
