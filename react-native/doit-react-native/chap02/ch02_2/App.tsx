import React from 'react'
import { SafeAreaView, Text } from 'react-native'

//export default function App() {
//  return (
//    <SafeAreaView>
//      <Text>Hello JSX world!</Text>
//    </SafeAreaView>
//  )
//}

export default function App() {
  const isLoading = true
  if (isLoading) {
    return (
      <SafeAreaView>
        <Text>Loading...</Text>
      </SafeAreaView>
    )
  }
  return (
    <SafeAreaView>
      <Text>Hello JSX world!</Text>
    </SafeAreaView>
  )
}
