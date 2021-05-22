import React from 'react'
import { SafeAreaView, Alert, Button, TextInput } from 'react-native'
import { TouchableOpacity, TouchableHighlight, Text } from 'react-native'

const onPress = () => Alert.alert('home pressed.', 'message')

// 터처블 컴포넌트 추가
export default function App() {
  return (
    <SafeAreaView>
      <Button title="Home" onPress={onPress} />
      <TouchableOpacity onPress={onPress}>
        <Text>TouchableOpacity</Text>
      </TouchableOpacity>
      <TouchableHighlight onPress={onPress}>
        <Text>TouchableHighlight</Text>
      </TouchableHighlight>
      {/* Text와 TextInput 추가 */}
      <TextInput
        placeholder="enter your name"
        onChangeText={(text: string) => console.log(text)}
        onFocus={() => console.log('onFocus')}
        onBlur={() => console.log('onBlur')}
        onEndEditing={() => console.log('onEndEditing')}
      />
    </SafeAreaView>
  )
}
